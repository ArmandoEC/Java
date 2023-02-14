package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students on course A?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Type the %d# stundent:",i+1);
			int student = sc.nextInt();
			a.add(student);
		}
		
		System.out.print("How many students on course B?");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Type the %d# stundent:",i+1);
			int student = sc.nextInt();
			b.add(student);
		}
		
		System.out.print("How many students on course C?");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Type the %d# stundent:",i+1);
			int student = sc.nextInt();
			c.add(student);
		}
		
		
		Set<Integer> d = new HashSet<>(a);
		d.addAll(b);
		d.addAll(c);
		
		System.out.println("Total Students: "+d.size());
		
		
		
		
		
		
		sc.close();

	}

}
