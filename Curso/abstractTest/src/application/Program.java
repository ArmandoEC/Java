package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnum.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> lista = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Shape #%d data: \n",i+1);
			System.out.print("Rectangle or Circle (r/c)? ");
			char response = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if(response == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Weight: ");
				double weight = sc.nextDouble();
				
				lista.add(new Rectangle(Color.valueOf(color), width, weight));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				lista.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println("Shape Areas");
		for(Shape c: lista) {
			System.out.println(c);
		}
		
		
		sc.close();

	}

}
