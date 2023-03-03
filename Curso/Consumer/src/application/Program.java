package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import entities.ProductConsumer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// implementando consumer a partir de uma interface

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));

		list.forEach(new ProductConsumer());

		list.forEach(System.out::println);

		// implementando consumer a partir de um método estático referencia para um
		// método

		List<Product> list1 = new ArrayList<>();

		list1.add(new Product("Tv", 900.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.50));
		list1.add(new Product("Hd Case", 80.90));

		list1.forEach(Product::staticProductConsumer);

		list1.forEach(System.out::println);

		// implementando predicate a partir de um método não estático referencia para um
		// método

		List<Product> list2 = new ArrayList<>();

		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("Hd Case", 80.90));

		list2.forEach(Product::nonStaticProductConsumer);

		list2.forEach(System.out::println);

		// implementando predicate a partir de uma expressao lambda declarada

		List<Product> list3 = new ArrayList<>();

		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.50));
		list3.add(new Product("Hd Case", 80.90));

		Consumer<Product> pred = p -> p.setPrice(p.getPrice()*1.1);

		list3.forEach(pred);

		list3.forEach(System.out::println);

		// implementando predicate a partir de uma expressao lambda direta

		List<Product> list4 = new ArrayList<>();

		list4.add(new Product("Tv", 900.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.50));
		list4.add(new Product("Hd Case", 80.90));


		list4.forEach(p -> p.setPrice(p.getPrice()*1.1));

		list4.forEach(System.out::println);
	}

}
