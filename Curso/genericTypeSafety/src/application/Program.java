package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		int value;
		for(int i = 0; i<n; i++) {
			System.out.printf("Type the %dº value: ",i+1);
			value = sc.nextInt();
			ps.addValue(value);
		}
		
		System.out.println("Values:");
		ps.print();
		System.out.println("\nFirst value:");
		System.out.println(ps.first());
		
		
		
		
		
		
		
		sc.close();

	}

}
