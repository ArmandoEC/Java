package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\pc\\Documents\\WorkSpace\\Java\\Exercícios\\exercicioPipelineStream\\funcionarios.txt";
		
		List<Employee> funcionarios = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line!=null) {
				String[] dados = line.split(",");
				
				funcionarios.add(new Employee(dados[0],dados[1], Double.parseDouble(dados[2])));
				
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		List<String> emails = funcionarios.stream()
			.filter(p -> p.getSalary() > salary)
			.map(p -> p.getEmail())
			.sorted((x,y) -> x.toUpperCase().compareTo(y.toUpperCase()))
			.collect(Collectors.toList());
		
		System.out.println("Email of people whose salary is more than "+String.format(" %.2f", salary));
		emails.forEach(System.out::println);
		
		double sum = funcionarios.stream()
				.filter(p -> p.getName().charAt(0) == 'M')
				.map(p -> p.getSalary())
				.reduce(0.0, (x,y) -> x+y);
		
		System.out.println("Sum of salary of people whose name starts with 'M': "+sum);		
		
		
		
		sc.close();

	}

}
