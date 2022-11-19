package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class ContrutorTodasVariaveis{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//programa com um construtor aonde sou obrigado a iniciar todas as variáveis
		
		System.out.print("Digite o nome do produto: ");
		String name = sc.next();
		System.out.print("Digite o preco do produto: ");
		double price = sc.nextDouble();
		System.out.print("Digite a quantidade do produto: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name,price,quantity);
		
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
