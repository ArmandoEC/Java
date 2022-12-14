package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Pessoa;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;
import model.entities.Produto;
import model_enum.PessoaStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
			
		List<Pessoa> pessoas = new ArrayList <> ();
		List<Produto> produtos = new ArrayList <> ();
		
		String pathPessoa = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Pessoa.txt";
		
		lerPessoas(pathPessoa,pessoas);
		
		 
		int menu = 1;
		
		while(menu != 0) {
			System.out.println("-------------MENU---------------");
			System.out.println("1 - Cadatrar pessoa");
			System.out.println("2 - Cadastrar produto");
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
				
				case 2:
					System.out.println("Digite o id do produto: ");
					int idProd = sc.nextInt();
					existe = 0;
					for(Produto e: produtos) {
						if(e.getId()==idProd) {
							System.out.println("Id já existente");
							existe = 1;
						}
					}
					if (existe!=1){
						System.out.print("Digite o nome do produto: ");
						sc.nextLine();
						String nomeProd = sc.nextLine();
						System.out.println("Digite o valor do produto: ");
						double valor = sc.nextDouble();
						
						produtos.add(new Produto(idProd, nomeProd, valor));
						
						for(Produto e: produtos) {
							if(e.getId()==idProd) {
								e.salvarProduto(e.toString());
							}
						}
					}
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}



	public static void lerPessoas(String pathPessoa,List<Pessoa> pessoas) {
		try(BufferedReader br = new BufferedReader(new FileReader(pathPessoa))){
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			String receber = br.readLine();
			while(receber!=null) {
				String[] leitura = receber.split(",");
				if(leitura[2].length() == 11) {
					pessoas.add(new PessoaFisica(leitura[1],Integer.parseInt(leitura[0]), LocalDate.parse(leitura[3], fmt1), leitura[4], PessoaStatus.valueOf(leitura[5]), leitura[2]));
				}
				else {
					pessoas.add(new PessoaJuridica(leitura[1],Integer.parseInt(leitura[0]), LocalDate.parse(leitura[3], fmt1), leitura[4], PessoaStatus.valueOf(leitura[5]), leitura[2]));
				}
				receber = br.readLine();
			}
		
		}
		catch(IOException e) {
			System.out.println("Não foi possivel ler os dados de pessoa. "+ e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Não foi possivel ler os dados de pessoa. "+ e.getMessage());
		}
	}
}
