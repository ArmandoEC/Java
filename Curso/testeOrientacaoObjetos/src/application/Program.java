package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Triangle;

public class Program {
	
	

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x= new Triangle();
		y= new Triangle();
		
		System.out.println("Digite os valores do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Àrea do triângulo X é: %.4f\n",areaX);
		System.out.printf("Àrea do triângulo Y é: %.4f\n",areaY);
		
		if(areaX>areaY) {
			System.out.println("A maior area é : X");
		}else {
			System.out.println("A maior area é : Y");
		}
		
		
		sc.close();

	}

}
