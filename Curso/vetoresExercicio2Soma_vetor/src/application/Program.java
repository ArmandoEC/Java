package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		double vect[] = new double[sc.nextInt()];
		double soma = 0;
		
		for(int i = 0; i<vect.length; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.print("VALORES = ");
		
		for(int i = 0; i< vect.length; i++) {
			
			System.out.printf("%.2f ", vect[i]);

		}
		
		System.out.printf("\nSOMA = %.2f\n",soma);
		System.out.printf("MEDIA = %.2f",soma/vect.length);
		
		sc.close();

	}

}
