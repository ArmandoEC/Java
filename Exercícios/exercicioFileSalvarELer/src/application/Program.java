package application;

import java.io.BufferedWriter;
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
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))){
			for(Produto e: produtos) {
				bw.write(e.toString(),0,e.toString().length());
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
