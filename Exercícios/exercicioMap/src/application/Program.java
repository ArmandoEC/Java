package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String,Integer> votes = new TreeMap<>();
		
		String path = "C:\\Users\\pc\\Documents\\WorkSpace\\Java\\Exercícios\\exercicioMap\\votes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			 
				String line = br.readLine();
				
				while(line != null) {
					String[] leitura = line.split(",");
					String name = leitura[0];
					int count = Integer.parseInt(leitura[1]);
					
					if(votes.containsKey(name)) {
						int votosAtuais = votes.get(name);
						votes.put(name, votosAtuais + count);					}
					else {
						votes.put(name, count);
					}
					
					
					line = br.readLine();
				}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Votes count");
		
		for(String key: votes.keySet()) {
			System.out.println(key + ": "+votes.get(key));
		}

	}

}
