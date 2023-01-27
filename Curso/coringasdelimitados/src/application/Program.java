package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0,2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("myShapes total area: "+totalArea(myShapes));
		System.out.println("myCircles total area: "+totalArea(myCircles));
		
	}
	
	public static double totalArea(List<? extends Shape> list) { // chamar o método de qual lista que extende a classe shape
		//list.add(new Circle(2.0)); em uma lista delimitada não é possivel adicionar valores somente ler eles
		double sum = 0;
		
		for(Shape s: list) {
			sum += s.area();
		}
		
		return sum;
		
	}

}
