package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class ConstrutorParcial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Construtor que inicia somente uma parte das varáveis, já que o java instacia com um valor padrão para cada tipo de variável
		
		System.out.print("Digite o nome do produto: ");
		String name = sc.next();
		System.out.print("Digite o preco do produto: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name,price);
		
		System.out.println(product);
		
		System.out.print("\nEntre com a quantidade a ser adicionada do estoque: ");
		product.addProducts(sc.nextInt());
		System.out.println(product);
		
		System.out.print("\nEntre com a quantidade a ser retirada do estoque: ");
		product.removeProducts(sc.nextInt());
		System.out.println(product);
		
		
		sc.close();

	}

}
