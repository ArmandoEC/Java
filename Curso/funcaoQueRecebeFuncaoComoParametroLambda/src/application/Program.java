package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Product;
import services.SumService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// implementando consumer a partir de uma interface

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));

		SumService sc = new SumService();
		
		double sum = sc.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println(sum);
	}

}
