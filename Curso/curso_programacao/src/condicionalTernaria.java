import java.util.Scanner;

public class condicionalTernaria {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
	double x;
	double y;

	System.out.println("Digite o valor do produto e descubra o seu desconto");
	
	x = sc.nextDouble();
	
	y=(x < 50.50) ? x * 0.05 : x * 0.1;
	
	System.out.println("O valor de desconto é: "+y);
	
	sc.close();
	
	}
	
}
