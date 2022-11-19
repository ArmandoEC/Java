package entities;

public class Rectangle {

	public double altura;
	public double largura;
	

	public double area() {
		return largura*altura;
	}
	
	public double perimetro() {
		return 2*(altura+largura);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(largura, 2))+(Math.pow(altura,2)));
	}
}
