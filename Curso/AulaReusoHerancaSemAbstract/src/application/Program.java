package application;

import models.entities.Circle;
import models.entities.Rectangle;
import models.entities.Shape;
import models.enums.Color;

public class Program {

	public static void main(String[] args) {
		System.out.println("Exemplo de herança sem interface com reuso de código, pois não é obrigatório implementar os atributos da super classe.");
		
		Shape circle = new Circle(Color.BLACK, 1.0);
		Shape rectangle = new Rectangle(Color.WHITE, 2.0);
		
		System.out.println("Circle: Color > "+circle.getColor()+" Area > "+circle.area());
		System.out.println("Rectangle: Color > "+rectangle.getColor()+" Area > "+rectangle.area());
	}

}
