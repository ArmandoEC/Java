package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramLambda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> lista = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Empregado %d:\n",i+1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (hasId(lista, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sálario: ");
			double salario = sc.nextDouble();
			
			Employee emp = new Employee(id,nome,salario);
			
			lista.add(emp);
		}
		
		System.out.println("\n\nLista de empregados:");
		
		for(Employee x : lista) {
			System.out.println(x);
		}
		
		System.out.print("\n\nDigite o id do funcionario que terá o salário aumentado: ");
		int id = sc.nextInt();
		
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		
		if(emp == null) {
			System.out.print("\nO id digitado não existe!!!\n");
		}
		else {
			System.out.print("\nDigite a porcentagem a aumentar: ");
			double perc = sc.nextDouble();
			emp.aumentoSalario(perc);
		}
		
		
		System.out.println();
		
		for(Employee x : lista) {
			System.out.println(x);
		}
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
