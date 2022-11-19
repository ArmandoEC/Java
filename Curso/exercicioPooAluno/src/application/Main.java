package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluno;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno");
		aluno.nome = sc.nextLine();
		
		do {
			System.out.println("Informe a nota do primeiro trimeste de 0 a 30:");
			aluno.nota1 = sc.nextDouble();
			
			if(aluno.nota1 > 30) {
				System.out.println("Nota inválida");
			}
		}while(aluno.nota1 > 30);
		
		
		do {
			System.out.println("Informe a nota do segundo trimeste de 0 a 35:");
			aluno.nota2 = sc.nextDouble();
			
			if(aluno.nota2 > 35) {
				System.out.println("Nota inválida");
			}
		}while(aluno.nota2 > 35);
		
		
		do {
			System.out.println("Informe a nota do terceiro trimeste de 0 a 35:");
			aluno.nota3 = sc.nextDouble();
			
			if(aluno.nota3 > 35) {
				System.out.println("Nota inválida");
			}
		}while(aluno.nota3 > 35);
		
		System.out.println(aluno);
		
		
		sc.close();

	}

}
