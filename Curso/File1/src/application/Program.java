package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\pc\\Documents\\workSpace\\Curso\\File1.txt");//lendo o arquivo nesse diretório
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); //scanner lendo os dados do arquivo e imprimindo os dados
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
