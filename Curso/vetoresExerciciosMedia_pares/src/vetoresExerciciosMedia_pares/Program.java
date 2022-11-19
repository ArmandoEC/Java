package vetoresExerciciosMedia_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int vect[] = new int[sc.nextInt()];
		double avg = 0;
		int count = 0;
		for(int i =0; i < vect.length; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				avg += vect[i];
				count++;
			}
		}
		
		if(avg > 0) {
			System.out.printf("MEDIA DOS PARES = %.2f\n", avg/count);
		}
		else {
			System.out.print("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}

}
