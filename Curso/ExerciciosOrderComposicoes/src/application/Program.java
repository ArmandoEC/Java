package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Bith date: ");
		LocalDate birthDate = LocalDate.parse(sc.next(),fmt1);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(LocalDateTime.now(),OrderStatus.valueOf(status),new Client(name,email,birthDate));

		
		System.out.println("How many itens to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.printf("Enter #%d item data:\n",i+1);
			System.out.print("Product name:");
			String productName = sc.next();
			System.out.print("Product price:");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity,new Product(productName,productPrice));
			order.addItem(item);
		}
		
		System.out.println(order);
		
		
		sc.close();

	}

}
