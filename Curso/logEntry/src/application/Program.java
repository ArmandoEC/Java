package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import entites.LogEntry;

public class Program {

	public static void main(String[] args) {

		String inPath = "C:\\Users\\pc\\Documents\\WorkSpace\\Java\\Curso\\logEntry\\in.txt";
		
		Set<LogEntry> conjunto = new HashSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(inPath))){
			
			
			String file = br.readLine();
			
			
			while(file != null) {
				String[] data = file.split(" ");
				
				
				conjunto.add(new LogEntry(data[0], Instant.parse(data[1])));
				
				file = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(conjunto.size());

	}

}
