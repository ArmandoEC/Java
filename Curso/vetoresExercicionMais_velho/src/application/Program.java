package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vai digitar? ");
		Pessoa[] vect = new Pessoa[sc.nextInt()];
		int maisVelho = 0;
		int aux = 0;
		
		for(int i = 0; i < vect.length; i++){
			System.out.printf("Dados da %da pessoa:\n",i+1);
			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Idade:");
			int idade = sc.nextInt();
			
			vect[i] = new Pessoa(nome,idade);
			
			if(vect[i].getIdade() > maisVelho) {
				maisVelho = vect[i].getIdade();
				aux = i;
			}
		}
		
		System.out.printf("Pessoa mais velha: %s", vect[aux].getNome());
		
		sc.close();

	}

}
