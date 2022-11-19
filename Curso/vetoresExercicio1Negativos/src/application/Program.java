package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar? ");
		int vect[] = new int[sc.nextInt()];
		
		for(int i = 0; i<vect.length; i++) {
			
			System.out.println("Digite um número");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Valores negativos");
		
		for(int i = 0; i< vect.length; i++) {
			
			if(vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
