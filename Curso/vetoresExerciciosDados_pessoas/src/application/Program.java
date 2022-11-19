package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		Pessoas[] vect = new Pessoas[sc.nextInt()];
		int countHomens = 0;
		double menorAltura = 100;
		double maiorAltura = 0;
		int countMulheres = 0;
		double avg = 0;
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite a altura da %da pessoa:",i+1);
			double altura = sc.nextDouble();
			System.out.printf("Digite o genero da %da pessoa:",i+1);
			char genero = sc.next().charAt(0);
			
			vect[i] = new Pessoas(altura,genero);
			
			if(vect[i].getGenero() == 'M') {
				countHomens++;
			}else {
				countMulheres ++;
				avg += vect[i].getAltura();
			}
			
			if(vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
			
			if(vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
		}
		
		System.out.println("Menor altura: "+menorAltura);
		System.out.println("Maior altura: "+maiorAltura);
		System.out.println("Média da altura das mulheres: "+avg/countMulheres);
		System.out.println("Número de homens: "+countHomens);
		
		sc.close();

	}

}
