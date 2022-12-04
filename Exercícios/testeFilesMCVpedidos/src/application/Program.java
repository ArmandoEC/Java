package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Pessoa;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;
import model_enum.PessoaStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		List<Pessoa> pessoas = new ArrayList <> ();
		int menu = 1;
		
		while(menu != 0) {
			System.out.println("-------------MENU---------------");
			System.out.println("1 - Cadatrar pessoa");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.println("4 - ");
			System.out.println("5 - ");
			System.out.println("6 - ");
			System.out.println("7 - ");
			System.out.println("8 - ");
			System.out.println("9 - ");
			System.out.println("10 - ");
			System.out.println("1 - ");
			System.out.println("0 - sair");
			System.out.println("Digite uma opção do menu: ");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("Digite o id da pessoa");
					int id = sc.nextInt();
					int existe = 0;
						for(Pessoa e: pessoas) {
							if(e.getId()==id) {
								System.out.println("Id já existente");
								existe = 1;
							}
						}
					if(existe !=1) {
						System.out.print("Digite o nome da pessoa: ");
						sc.nextLine();
						String nome = sc.nextLine();
						System.out.println("Pessoa fisica ou juridica? (F/J): ");
						char fisicaJuridica = sc.next().charAt(0);
						
						if(fisicaJuridica == 'F') {
							System.out.println("Digite o CPF da pessoa: ");
							String cpf = sc.next();
							
							pessoas.add(new PessoaFisica(nome, id, LocalDate.now(), null, PessoaStatus.valueOf("ATIVO"), cpf));
						}
						else {
							System.out.println("Digite o CNPJ: ");
							String cnpj = sc.next();
							pessoas.add(new PessoaJuridica(nome, id, LocalDate.now(), null, PessoaStatus.valueOf("ATIVO"), cnpj));
						}
						
						for(Pessoa e: pessoas) {
							if(e.getId()==id) {
								e.salvarPessoa(e.toString());
							}
						}
						
					}
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
