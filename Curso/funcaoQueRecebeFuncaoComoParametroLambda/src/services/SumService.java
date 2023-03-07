package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class SumService {
	
	public double filteredSum (List<Product> list, Predicate<Product> pred) {
		double sum = 0.0;
		
		for(Product p:list) {
			if(pred.test(p)) {
				sum += p.getPrice();
			}
		}
		
		return sum;
	}
}
