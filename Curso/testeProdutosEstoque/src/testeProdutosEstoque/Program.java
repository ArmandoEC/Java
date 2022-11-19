package testeProdutosEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Produtos> lista = new ArrayList <> ();
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção do menu: ");
			System.out.println("1- Cadastrar produto");
			System.out.println("2- Alterar o código de fabrica do produto");
			System.out.println("3- Remover produto");
			System.out.println("4- Precificar produto");
			System.out.println("5- Precificar por % o produto");
			System.out.println("6- Adicionar estoque ao produto");
			System.out.println("7- Diminuir estoque do produto");
			System.out.println("8- Listar produtos");
			System.out.println("9- Sair");
			menu = sc.nextInt();
			Produtos produ = null;
			
			switch(menu) {
			
				case 1:
					
					System.out.print("Digite o id do produto: ");
					int id = sc.nextInt();
					System.out.print("Digite o nome do produto: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Inicializar valor? S ou N");
					char op = sc.next().charAt(0);
					if(op == 'S') {
						System.out.print("Digite o valor do produto: ");
						double valor = sc.nextDouble();
						
						Produtos prod = new Produtos(id,nome,valor);
						lista.add(prod);
					}
					else {
						Produtos prod = new Produtos(id,nome);
						lista.add(prod);
					}
				break;
				
				case 2:
					for(Produtos x : lista) {
						System.out.println(x);
					}
					System.out.println("Digite id do produto para alterar o código de fábrica: ");
					int aux = sc.nextInt();
					
					for(Produtos x : lista) {
						if(x.getId() == aux) {
							produ = x;
						}
					}
					
					if(produ == null) {
						System.out.println("ID inexistente!!!");
					}
					else {
						System.out.println("Digite o codfabrica do produto: ");
						produ.setCodFabrica(sc.nextInt());
					}
					produ = null;
				break;
				
				case 3:
					for(Produtos x : lista) {
						System.out.println(x);
					}
					System.out.println("Digite id do produto a ser excluído: ");
					aux= sc.nextInt();
					
					for(Produtos x : lista) {
						if(x.getId() == aux) {
							produ = x;
						}
					}
					
					if(produ == null) {
						System.out.println("ID inexistente!!!");
					}
					else {
						lista.remove(produ);
					}
					produ = null;
				break;
				
				case 4:
					for(Produtos x : lista) {
						System.out.println(x);
					}
					System.out.println("Digite id do produto a ser precificado: ");
					aux= sc.nextInt();
					
					for(Produtos x : lista) {
						if(x.getId() == aux) {
							produ = x;
						}
					}
					
					if(produ == null) {
						System.out.println("ID inexistente!!!");
					}
					else {
						System.out.println("Digite o valor do produto: ");
						produ.alterarValor(sc.nextDouble());
					}
					produ = null;					
				break;
				
				case 5:
					for(Produtos x : lista) {
						System.out.println(x);
					}
					System.out.println("Digite id do produto a ser precificado com %: ");
					aux= sc.nextInt();
					
					for(Produtos x : lista) {
						if(x.getId() == aux) {
							produ = x;
						}
					}
					
					if(produ == null) {
						System.out.println("ID inexistente!!!");
					}
					else {
						System.out.println("Digite o valor em % a ser precificado: ");
						produ.AlterarValorPerc(sc.nextDouble());
					}
					produ = null;					
				break;
				
				case 6:
					for(Produtos x : lista) {
						System.out.println(x);
					}
					System.out.println("Digite id do produto para dar entrada: ");
					aux= sc.nextInt();
					
					for(Produtos x : lista) {
						if(x.getId() == aux) {
							produ = x;
						}
					}
					
					if(produ == null) {
						System.out.println("ID inexistente!!!");
					}
					else {
						System.out.println("Digite a quatidade para dar entrada: ");
						produ.adicionarEstoque(sc.nextInt());
					}
					produ = null;					
				break;
				
				case 7:
					for(Produtos x : lista) {
						System.out.println(x);
					}
					System.out.println("Digite id do produto para dar saida: ");
					aux= sc.nextInt();
					
					for(Produtos x : lista) {
						if(x.getId() == aux) {
							produ = x;
						}
					}
					
					if(produ == null) {
						System.out.println("ID inexistente!!!");
					}
					else {
						System.out.println("Digite a quatidade para dar saida: ");
						produ.removerEstoque(sc.nextInt());
					}
					produ = null;					
				break;
				
				case 8:
					for(Produtos x : lista) {
						System.out.println(x);
					}				
				break;
				
				case 9:
					System.out.println("Obrigado!!!");				
				break;
				
				default:
					System.out.println("Opção inválida!!!");
			}
			
			
		}while(menu != 9);
		
		
		
		sc.close();

	}

}
