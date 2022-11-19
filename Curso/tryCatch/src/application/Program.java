package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		metodo1(); // chamando o método 1
		
		System.out.println("End of program!");
		

	}
	
	public static void metodo1() {
		System.out.println("metodo1 inicio");
		metodo2(); // chamando o método2
		System.out.println("metodo1 fim");
	}
	
	public static void metodo2() {
		System.out.println("Método2 inicio");
		Scanner sc = new Scanner(System.in);
		
		try {  //tenta executar o bloco de código e se cair em exceção ele cai no catch caso esteja tratado
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!"); //acontece ao tentar acessar uma posição do vetor que não existe
			e.printStackTrace(); //vai imprimir na tela o rastreamento de chamados do método, por padrão se não for tratado o java já imprime ele
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Posição inválida"); //acontece ao tentar acessar uma posição inválida ex: a
		}
		
		System.out.println("Método2 fim");
		
		sc.close();
	}


}
