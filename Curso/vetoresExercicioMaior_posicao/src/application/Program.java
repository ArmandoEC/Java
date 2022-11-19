package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números deseja digitar:");
		double vect[] = new double[sc.nextInt()];
		double max = 0;
		int posicao = 0;
		
		for(int i =0; i < vect.length; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i] > max) {
				max = vect[i];
				posicao = i;
			}
		}
		
		System.out.println("Maior valor: "+max);
		System.out.println("Posição do maior valor: "+posicao);
		
		sc.close();

	}

}
