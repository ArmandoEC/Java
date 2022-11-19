import java.util.Scanner;

public class funcao {
	
	public static int max(int a,int b,int c) {
		
		if(a>b && a>c) {
			return a;
		}else if(b>c) {
			return b;
		}else {
			return c;
		}
	}

	public static void resultado(int valor) {
		
		System.out.println("Maior valor: "+valor);
	
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três valores inteiros");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int valor = max(x,y,z);
		
		resultado(valor);
		
		sc.close();

	}

}
