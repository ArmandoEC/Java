package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Quantos alunos serão digitados? ");
		Pessoas[] vect = new Pessoas[sc.nextInt()]; 
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno: ",i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Pessoas(nome,nota1,nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < vect.length; i++) {
			
			if((vect[i].getNota1()+vect[i].getNota2())/2 >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}

}
