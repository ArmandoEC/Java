package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho a ser trabalhado: ");
		String strPath = sc.nextLine();
		
		List<Produto> produtos = new ArrayList<>();
		
		
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.printf("Dados do #%d produto: \n",i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Valor: ");
			double valor = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			produtos.add(new Produto(nome, valor, quantidade));
		}
		
	
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath+"\\Source.csv"))){
			for(Produto e: produtos) {
				bw.write(e.toString(),0,e.toString().length());
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		List<Produto> lerProdutos = new ArrayList<>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath+"\\Source.csv"))) {
			for(int i =0; i<n; i++) {
				String[] leitura = br.readLine().split(",");
				lerProdutos.add(new Produto(leitura[0],Double.parseDouble( leitura[1]),Integer.parseInt(leitura[2])));
				
			}
			
		}		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		new File (strPath+"\\out").mkdir();
		
		
		try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(strPath+"\\out\\summary.csv"))){
			for(Produto e: lerProdutos) {
				bw1.write(e.summary());
				bw1.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		sc.close();

	}

}
