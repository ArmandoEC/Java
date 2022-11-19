import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a;
		int b;
		double c;
		char d;
		
		a = sc.nextLine();
		b = sc.nextInt();
		c = sc.nextDouble();
		d = sc.next().charAt(5);
		
		System.out.println("Você digitou a palavra em string "+a);
		System.out.printf("Você digitou o número inteiro: %d\n",b);
		System.out.printf("Você digitou o número float: %.2f\n",c);
		System.out.println("Você digitou o char: "+d);
		
		sc.close();
}}
