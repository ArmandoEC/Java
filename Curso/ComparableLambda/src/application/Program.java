package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.MyComparator;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> p = new ArrayList<>();
		
		p.add(new Product("TV",900.00));
		p.add(new Product("Notebook",1200.00));
		p.add(new Product("Table",450.00));
		
		p.sort(new MyComparator()); //comparando o nome dos produtos usando uma classe separada para implementar
		
		for(Product e: p) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		List<Product> p1 = new ArrayList<>();
		
		p1.add(new Product("TV",900.00));
		p1.add(new Product("Notebook",1200.00));
		p1.add(new Product("Table",450.00));
		
		
		
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
			
		};
		p1.sort(comp); //comparando o nome dos produtos usando uma classe implementada na classe principal
		
		for(Product e: p) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		List<Product> p2 = new ArrayList<>();
		
		p2.add(new Product("TV",900.00));
		p2.add(new Product("Notebook",1200.00));
		p2.add(new Product("Table",450.00));
		
		
		
		Comparator<Product> comp1 = (p3,p4) -> {
				return p3.getNome().toUpperCase().compareTo(p4.getNome().toUpperCase());	
		};
		
		p2.sort(comp1); //comparando o nome dos produtos usando uma classe implementada com lambda 
		
		for(Product e: p) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		List<Product> p3 = new ArrayList<>();
		
		p3.add(new Product("TV",900.00));
		p3.add(new Product("Notebook",1200.00));
		p3.add(new Product("Table",450.00));
		
		
		
		Comparator<Product> comp2 = (p5,p6) -> p5.getNome().toUpperCase().compareTo(p6.getNome().toUpperCase());	
		
		p3.sort(comp2); //comparando o nome dos produtos usando uma classe implementada com lambda resumido
		
		for(Product e: p) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		List<Product> p4 = new ArrayList<>();
		
		p4.add(new Product("TV",900.00));
		p4.add(new Product("Notebook",1200.00));
		p4.add(new Product("Table",450.00));
		
		
		
		p4.sort((p5,p6) -> p5.getNome().toUpperCase().compareTo(p6.getNome().toUpperCase())); //comparando o nome dos produtos usando uma classe implementada 
		//com lambda mais resumido ainda
		
		for(Product e: p) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
	}

}
