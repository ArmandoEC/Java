package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		Pessoas [] vect = new Pessoas[sc.nextInt()];
		double soma = 0;
		int anos_16 = 0;
		
		for(int i = 0; i<vect.length; i++) {
			
			System.out.printf("Dados da %da pessoa: \n",i+1);
			System.out.print("Nome:");
			String name = sc.next();
			System.out.print("Idade:");  
			int idade = sc.nextInt();
			System.out.print("Altura:");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoas(name,idade,altura);
			
			soma += vect[i].getAltura();
			
			if(idade < 16) {
				anos_16++;
			}
		}
		
		
		System.out.printf("Altura média: %.2f\n",soma/vect.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f\n",(double)(anos_16*100)/vect.length);
		
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i].getIdade() < 16) {
				System.out.printf("%s\n",vect[i].getNome());
			}
			
		}
		
		
		
		
		sc.close();

	}

}
