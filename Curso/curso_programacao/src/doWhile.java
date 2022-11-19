import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			
			System.out.print("Digite a temperatura em graus celcius");
			double x = sc.nextDouble();
			double y = 9.0 * x / 5.0 + 32.0;
			System.out.printf("A temperatura em F é : %.1f\n",y);
			System.out.print("Deseja continuar com a conversão?");
			resp = sc.next().charAt(0);
			
		}while(resp != 'n');
		
		sc.close();
	}

}
