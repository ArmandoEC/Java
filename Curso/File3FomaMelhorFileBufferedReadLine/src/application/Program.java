package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\pc\\Documents\\workSpace\\Curso\\File1.txt"; //lendo um arquivo em um caminho
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){ //instanciando um bufferreader com upcastin no filereader
			String line = br.readLine(); //lendo as linhas do arquivo
			
			while(line != null) {//imprimindo as linhas do arquivo
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}
