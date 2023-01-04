package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Pedido;
import model.entities.PedidoItens;
import model.entities.Pessoa;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;
import model.entities.Produto;
import model_enum.PedidoStatus;
import model_enum.PessoaStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
			
		List<Pessoa> pessoas = new ArrayList <> ();
		List<Produto> produtos = new ArrayList <> ();
		List<Pedido> pedidos = new ArrayList <> ();
		List<PedidoItens> pedidoItens = new ArrayList <> ();
		
		String pathPessoa = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Pessoa.txt";
		String pathProduto = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Produto.txt";
		String pathPedido = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Pedido.txt";
		String pathPedidoItem = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\PedidoItem.txt";
		
		lerPessoas(pathPessoa,pessoas);
		lerProdutos(pathProduto, produtos);
		lerPedidos(pathPedido, pedidos);
		lerPedidosItens(pathPedidoItem, pedidoItens);

		int menu = 1;
		
		while(menu != 0) {
			System.out.println("-------------MENU---------------");
			System.out.println("1 - Cadatrar pessoa");
			System.out.println("2 - Cadastrar produto");
			System.out.println("3 - Ativar/Inativar pessoa");
			System.out.println("4 - Listar pessoas");
			System.out.println("5 - Listar produtos");
			System.out.println("6 - Novo Pedido");
			System.out.println("7 - ");
			System.out.println("8 - ");
			System.out.println("9 - ");
			System.out.println("10 - ");
			System.out.println("11 - ");
			System.out.println("0 - sair");
			System.out.println("Digite uma opção do menu: ");
			menu = sc.nextInt();
			int existe = 0;
			int opcao = 0;
			switch(menu) {
				
				case 1:
					System.out.println("Digite o id da pessoa");
					int id = sc.nextInt();
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
					}
				break;
				
				case 3:
					for(Pessoa e: pessoas) {
						System.out.println(e.imprimir());
					}
					
					System.out.println("Digite um ID para trocar o status: ");
					int idPessoa = sc.nextInt();
					
					for(Pessoa e: pessoas) {
						if(e.getId()==idPessoa) {
							existe = 1;
						}
					}
					
					if(existe == 1) {
						for(Pessoa e: pessoas) {
							if(e.getId()==idPessoa) {
								if(e.getPessoaStatus() == PessoaStatus.valueOf("ATIVO")) {
									e.setPessoaStatus(PessoaStatus.valueOf("INATIVO"));
								}
								else {
									e.setPessoaStatus(PessoaStatus.valueOf("ATIVO"));
								}
							}
						}
						System.out.println("Status Alterado com sucesso!");
					}
					else {
						System.out.println("ID Inexistente");
					}
				
				break;
				
				case 4:
					System.out.println("Pessoas Ativas:");
					
					for(Pessoa e: pessoas) {
						if(e.getPessoaStatus() == PessoaStatus.valueOf("ATIVO")) {
							System.out.println(e.imprimir());
						}
						
					}
					
					System.out.println("\nPessoas Inativas:");
					
					for(Pessoa e: pessoas) {
						if(e.getPessoaStatus() == PessoaStatus.valueOf("INATIVO")) {
							System.out.println(e.imprimir());
						}
						
					}
					
					
				break;
				
				case 5:
					System.out.println("Produtos:");
					
					for(Produto e: produtos) {
						System.out.println(e.imprimir());
					}
			
					
				break;
				
				case 6:
					if(pessoas == null || produtos == null) {
						System.out.println("Não existem dados suficientes para fazer um pedido!");
					}
					else {
						existe = 0;
						
						System.out.println("Digite o id do pedido: ");
						int idPedido = sc.nextInt();
						
						for(Pedido e : pedidos) {
							if(e.getId() == idPedido) {
								existe =1;
							}
						}
						
						if(existe == 1) {
							System.out.println("ID já existente!");
						}
						
						else {
						
							for(Pessoa e: pessoas) {
								if(e.getPessoaStatus() == PessoaStatus.valueOf("ATIVO")) {
									System.out.println(e.imprimir());
								}
							}
							
							System.out.println("\nDigite o id do cliente: ");
							int idCliente = sc.nextInt();
							
							existe = 0;
							for(Pessoa e: pessoas) {
								if(e.getId()==idCliente) {
									existe = 1;
								}
							}
							
							if(existe == 1) {
								opcao = 1;
								
								while(opcao !=0) {
									existe = 0;
									
									for(Produto e: produtos) {
										System.out.println(e.imprimir());
									}
									
									System.out.println("\nDigite o ID do produto ou 0 para sair");
									int idProduto = sc.nextInt();
									
									for(Produto e: produtos) {
										if(e.getId() == idProduto) {
											existe = 1;
										}
									}
						
									if(existe == 1) {
										System.out.println("Digite a quantidade do produto: ");
										int quantidade = sc.nextInt();
										
										if(quantidade <0) {
											System.out.println("Quantidade não pode ser menor ou igual a zero!");
										}
										
										else {
											try {
												double vlProduto = 0;
												for(Produto e: produtos) {
													if(e.getId() == idProduto) {
														vlProduto = e.getValor();
													}
												}
												
												pedidoItens.add(new PedidoItens(vlProduto, quantidade,idPedido,idProduto));
												pedidos.add(new Pedido(idPedido, LocalDateTime.now(), idCliente, PedidoStatus.valueOf("PENDENTE")));
											}
											catch(NullPointerException e) {
												System.out.println("Você não escolheu um produto! "+e.getMessage());
											}
										}
									}
									else {
										System.out.println("ID de produto inexistente");
									}
									
									
								}
							}
							else {
								System.out.println("ID do cliente não existe!");
							}

							
							
						}
					}
				
				break;
			}
		}
		
		
		System.out.println("Atualizando pessoas.........");
		for(Pessoa e: pessoas) {
				e.salvarPessoa(e.toString());
		}
		System.out.println("Atualizando produtos.........");
		for(Produto e: produtos) {
				e.salvarProduto(e.toString());
		}
		System.out.println("Atualizando pedidos.........");
		for(Pedido e: pedidos) {
				e.salvarPedido(e.toString());
		}
		System.out.println("Atualizando PedidoItens.........");
		for(PedidoItens e: pedidoItens) {
				e.salvarPedidoItens(e.toString());
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
	
	public static void lerProdutos(String pathProdutos,List<Produto> produtos) {
		try(BufferedReader br = new BufferedReader(new FileReader(pathProdutos))){
			
			String receber = br.readLine();
			while(receber!=null) {
				String[] leitura = receber.split(",");
				produtos.add(new Produto(Integer.parseInt(leitura[0]), leitura[1],Double.parseDouble( leitura[2])));
				receber = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Não foi possivel ler os dados dos produtos. "+ e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Não foi possivel ler os dados dos produtos. "+ e.getMessage());
		}
	}
	
	public static void lerPedidos(String pathPedidos,List<Pedido> pedidos) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy mm:HH:ss");
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathPedidos))){
			
			String receber = br.readLine();
			while(receber!=null) {
				String[] leitura = receber.split(",");
				pedidos.add(new Pedido(Integer.parseInt(leitura[0]), LocalDateTime.parse(leitura[1],fmt1), Integer.parseInt(leitura[2]), PedidoStatus.valueOf(leitura[3])));
				receber = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Não foi possivel ler os dados dos pedidos. "+ e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Não foi possivel ler os dados dos pedidos. "+ e.getMessage());
		}
	}
	
	public static void lerPedidosItens(String pathPedidos,List<PedidoItens> pedidoItens) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathPedidos))){
			
			String receber = br.readLine();
			while(receber!=null) {
				String[] leitura = receber.split(",");
				pedidoItens.add(new PedidoItens(Double.parseDouble(leitura[0]), Integer.parseInt(leitura[1]), Integer.parseInt(leitura[2]), Integer.parseInt(leitura[3])));
				receber = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Não foi possivel ler os dados dos Itens dos pedidos. "+ e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Não foi possivel ler os dados dos Itens dos pedidos. "+ e.getMessage());
		}
	}
}
