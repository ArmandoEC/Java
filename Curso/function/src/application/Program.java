package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import entities.ProductFunction;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// implementando function a partir de uma interface

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));

		List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());

		names.forEach(System.out::println);

		// implementando function a partir de um método estático referencia para um
		// método

		List<Product> list1 = new ArrayList<>();

		list1.add(new Product("Tv", 900.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.50));
		list1.add(new Product("Hd Case", 80.90));

		List<String> names1 = list1.stream().map(Product::staticProductFunction).collect(Collectors.toList());

		names1.forEach(System.out::println);

		// implementando function a partir de um método não estático referencia para um
		// método

		List<Product> list2 = new ArrayList<>();

		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("Hd Case", 80.90));

		List<String> names2 = list2.stream().map(Product::nonStaticProductFunction).collect(Collectors.toList());

		names2.forEach(System.out::println);

		// implementando function a partir de uma expressao lambda declarada

		List<Product> list3 = new ArrayList<>();

		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.50));
		list3.add(new Product("Hd Case", 80.90));

		Function<Product,String> func = p -> p.getName().toUpperCase();

		List<String> names3 = list3.stream().map(func).collect(Collectors.toList());

		names3.forEach(System.out::println);

		// implementando function a partir de uma expressao lambda direta

		List<Product> list4 = new ArrayList<>();

		list4.add(new Product("Tv", 900.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.50));
		list4.add(new Product("Hd Case", 80.90));


		List<String> names4 = list4.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names4.forEach(System.out::println);
	}

}
