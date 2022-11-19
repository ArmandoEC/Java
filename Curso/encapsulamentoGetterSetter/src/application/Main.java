package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Digite o nome do produto: ");
		product.setName(sc.nextLine()); //acessando o método de setar o valor
		System.out.print("Digite o preco do produto: ");
		product.setPrice(sc.nextDouble());

		
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
