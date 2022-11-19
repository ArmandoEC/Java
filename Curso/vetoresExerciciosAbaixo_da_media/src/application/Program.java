package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos o vetor terá? ");
		double vect[] = new double[sc.nextInt()];
		double avg = 0;
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um valor: ");
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		
		System.out.printf("MEDIA DO VETOR = %.3f\n",avg/vect.length);
		
		System.out.print("Elementos abaixo da média:\n");
		for(int i=0; i < vect.length; i++) {
			
			if(vect[i] < avg/vect.length) {
				System.out.printf("%.1f\n",vect[i]);
			}
			
			
		}
		
		
		sc.close();

	}

}
