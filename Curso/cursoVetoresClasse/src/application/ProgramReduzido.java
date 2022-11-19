package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramReduzido {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de produtos:");
		Product[] vect = new Product[sc.nextInt()];
		double avg = 0;
		
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			
			System.out.println("Digite o nome e valor do produto:");
			vect[i] = new Product(sc.nextLine(),sc.nextDouble());
			avg += vect[i].getValor();
		}
		
	
		System.out.printf("A média dos valores é %.2f", avg/vect.length);
		
		sc.close();

	}

}
