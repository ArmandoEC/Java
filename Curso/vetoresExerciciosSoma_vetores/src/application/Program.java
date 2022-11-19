package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		Vect[] A = new Vect[n];
		Vect[] B = new Vect[n];
		Vect[] C = new Vect[n];

		System.out.print("Digite os valores de A:");
		for(int i = 0; i < n; i++) {
			A[i] = new Vect(sc.nextInt());
		}
		
		System.out.print("\nDigite os valores de B:");
		for(int i = 0; i < n; i++) {
			B[i] = new Vect(sc.nextInt());
		}
		
		for(int i = 0; i < n; i++) {
			C[i] = new Vect(A[i].getValor()+B[i].getValor());
		}
		
		System.out.print("\nVetor Resultante:");
		for(int i = 0; i < n; i++) {
			System.out.println(C[i].getValor());
		}
		
		
		sc.close();

	}

}
