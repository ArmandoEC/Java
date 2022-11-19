package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array");
		int n = sc.nextInt();
		
		double vet[] = new double[n];
		
		for(int i = 0; i < n ; i++) {
			System.out.print("Digite uma altura: ");
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for(int i = 0; i<n ; i++) {
			sum += vet[i];
		}
		
		System.out.printf("A média das alturas é : %.2f",sum/n);
		sc.close();

	}

}
