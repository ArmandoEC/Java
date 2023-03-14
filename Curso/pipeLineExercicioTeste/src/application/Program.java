package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\pc\\Documents\\WorkSpace\\Java\\Curso\\pipeLineExercicioTeste\\produtos.txt";
		
		List<Product> products = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String fields[] = line.split(",");
				products.add(new Product(fields[0].toString(),Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			
			double avg = products.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (x,y) -> x+y) /products.size();
			
			System.out.println("Média de preços: "+ avg);
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = products.stream()
					.filter(p -> p.getPreco() < avg)
					.map(p -> p.getNome())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
					
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
