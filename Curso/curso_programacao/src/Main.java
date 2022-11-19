import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.60;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s, wich price is $ %.2f\n",product1,price1);
		System.out.printf("%s, wich price is $ %.2f\n\n",product2,price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n",age,code,gender);
		System.out.printf("Measue eight decimal places: %.8f\n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rounded (three decimal places) : %.3f\n",measure);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou : "+x);
		sc.close();
		
		
		
	}

}
