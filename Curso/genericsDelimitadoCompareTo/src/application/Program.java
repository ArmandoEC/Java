package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\pc\\Documents\\WorkSpace\\Java\\Curso\\genericsDelimitadoCompareTo\\in.txt";
		
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String [] fields = line.split(",");
				
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
				
			}
		}
		catch(IOException e){
			System.out.println("Não foi possivel ler a lista "+e.getMessage());
		}
		
		Product x = CalculationService.max(list);
		System.out.println("Max: "+x.toString());
	}

}
