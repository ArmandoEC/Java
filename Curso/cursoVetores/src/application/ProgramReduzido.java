package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramReduzido {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array");
		double vet[] = new double[sc.nextInt()];
		double sum = 0;
		
		for(int i = 0; i < vet.length ; i++) {
			System.out.print("Digite uma altura: ");
			vet[i] = sc.nextDouble();
			sum += vet[i];
		}

		
		System.out.printf("A média das alturas é : %.2f",sum/vet.length);
		sc.close();

	}

}
