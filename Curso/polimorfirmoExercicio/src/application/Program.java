package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> lista = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Produtct #%d data:\n",i+1);
			System.out.print("Common, used or imported? (c/u/i) ");
			char response = sc.next().charAt(0);
			System.out.print("Name");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(response == 'i') {
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				
				lista.add(new ImportedProduct(name, price, customs));
			}
			else if(response == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY)");
				LocalDate data = LocalDate.parse(sc.next(),fmt1);
				
				lista.add(new UsedProduct(name, price, data));
			}
			else {
				lista.add(new Product(name, price));
			}
			
		}
		
		System.out.println("PRICE TAGS:");
		for(Product e: lista) {
			System.out.println(e);
		}
		
		
		
		
		
		
		sc.close();

	}

}
