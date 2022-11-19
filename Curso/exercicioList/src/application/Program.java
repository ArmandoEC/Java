package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

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
		int encontrou = 0;
		
		
		for(Employee x : lista) {
			if(x.getId() == id) {
				System.out.print("Digite a porcentagem a aumentar: ");
				double perc = sc.nextDouble();
				x.aumentoSalario(perc);
				encontrou++;
			}
		}
		
		if(encontrou == 0) {
			System.out.print("\n\nO id digitado não existe!!!\n\n");
		}
		
		System.out.println();
		
		for(Employee x : lista) {
			System.out.println(x);
		}
		
		
		sc.close();
	}

}
