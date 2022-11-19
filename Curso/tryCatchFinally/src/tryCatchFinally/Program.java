package tryCatchFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt"); //declarando uma variavel file pra acessar um arquivo
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { //enquanto tiver linhas ele vai ler o arquivo
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage()); //quando ele cai na excessão
		}
		
		File file1 = new File("C:\\Users\\pc\\Documents\\workSpace\\Curso\\tryCatchFinally\\teste.txt"); //declarando uma variavel file pra acessar um arquivo
		Scanner sc1 = null;//buscando um arquivo existente
		try {
			sc1 = new Scanner(file1);
			while (sc1.hasNextLine()) { //enquanto tiver linhas ele vai ler o arquivo
				System.out.println(sc1.nextLine());
			}
		} catch (IOException e1) {
			System.out.println("Error opening file: " + e1.getMessage()); //quando ele cai na excessão
		} finally {
			if (sc1 != null || sc != null) { //ele executa esse bloco tendo ou não uma excessão
				sc1.close();
				System.out.println("finally executado");
			}
		}
	}
}