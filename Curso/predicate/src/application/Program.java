package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import entities.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// implementando predicate a partir de uma interface

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));

		list.removeIf(new ProductPredicate());

		for (Product p : list) {
			System.out.println(p);
		}

		// implementando predicate a partir de um método estático referencia para um
		// método

		List<Product> list1 = new ArrayList<>();

		list1.add(new Product("Tv", 900.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.50));
		list1.add(new Product("Hd Case", 80.90));

		list1.removeIf(Product::staticProductPredicate);

		for (Product p : list1) {
			System.out.println(p);
		}

		// implementando predicate a partir de um método não estático referencia para um
		// método

		List<Product> list2 = new ArrayList<>();

		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("Hd Case", 80.90));

		list2.removeIf(Product::nonStaticProductPredicate);

		for (Product p : list2) {
			System.out.println(p);
		}

		// implementando predicate a partir de uma expressao lambda declarada

		List<Product> list3 = new ArrayList<>();

		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.50));
		list3.add(new Product("Hd Case", 80.90));

		Predicate<Product> pred = p -> p.getPrice() >= 100;

		list3.removeIf(pred);

		for (Product p : list3) {
			System.out.println(p);
		}

		// implementando predicate a partir de uma expressao lambda direta

		List<Product> list4 = new ArrayList<>();

		list4.add(new Product("Tv", 900.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.50));
		list4.add(new Product("Hd Case", 80.90));


		list4.removeIf(p -> p.getPrice() >= 100);

		for (Product p : list4) {
			System.out.println(p);
		}
	}

}
