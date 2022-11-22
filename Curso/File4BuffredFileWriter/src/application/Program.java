package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String [] lines = new String[] {"Good Morning","Good Afternoom","Good Night"};//iniciando uma variavel para escrever no arquivo
		String path = "C:\\Users\\pc\\Documents\\workSpace\\Curso\\File2.txt";//lendo o caminho para o arquivo
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){//criando o arquivo caso não exista
			for(String line: lines) {									//o arguimento true faz com que escreva no arquivo em vez de criar outro por cima
				bw.write(line); //lendo as linhas do arquivo
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
