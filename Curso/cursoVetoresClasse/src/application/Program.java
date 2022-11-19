package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de produtos:");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			
			System.out.println("Digite o nome do produto:");
			String nome = sc.nextLine();
			System.out.println("Digite o valor do produto:");
			double valor = sc.nextDouble();
			
			vect[i] = new Product(nome,valor);
		}
		
		double avg = 0;
		
		for(int i = 0 ; i<n ; i++) {
			avg += vect[i].getValor();
		}
		
		avg = avg/n;
		System.out.printf("A média dos valores é %.2f", avg);
		
		sc.close();

	}

}
