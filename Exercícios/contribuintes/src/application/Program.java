package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> contribuintes = new ArrayList<>();
		
		System.out.println("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			System.out.printf("Contribuinte %d dados:\n",i+1);
			System.out.print("Pessoa Física ou Jurídica? (F/J): ");
			char response = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário anual: ");
			double salarioAnual = sc.nextDouble();
			
			if(response == 'F') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				contribuintes.add(new PessoaFisica(nome, salarioAnual, gastosSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				
				contribuintes.add(new PessoaJuridica(nome, salarioAnual, numFuncionarios));
			}
		}
		
		System.out.println("Taxa de imposto: ");
		for(Contribuintes c: contribuintes) {
			System.out.println(c);
		}
		
		double totalImpostos = 0;
		
		for(Contribuintes c: contribuintes) {
			totalImpostos += c.taxaImposto();
		}
		System.out.println("Total de impostos: $ "+totalImpostos);
		
		sc.close();

	}

}
