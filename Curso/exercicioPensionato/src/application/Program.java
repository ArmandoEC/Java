package application;

import java.util.Locale;
import java.util.Scanner;

import exercicioPensionato.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[10];
		System.out.print("Quando quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Aluguel #%d:\n",i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vet [quarto-1] = new Aluguel(nome,email);
		}
		
		System.out.print("Quartos ocupados: ");
		
		for(int i = 0; i < vet.length; i++) {
			
			if(vet[i] != null) {
				System.out.printf("%d: %s, %s\n",i+1,vet[i].getNome(),vet[i].getEmail());
			}
		}
		
		
		
		
		sc.close();

	}

}
