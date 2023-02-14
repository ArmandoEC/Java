package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map <String,String> cookies = new TreeMap<>(); //instanciando um map chave / valor
		
		cookies.put("username", "Maria"); //adicionado valores no map
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "62995111");
		
		cookies.remove("email");  //removendo do map via chave
		
		cookies.put("phone", "62995222");//adicionando uma chave por cima, ele não cria uma nova, só altera por cima o valor da chave
		
		System.out.println("Verificando se existe a chave phone: "+cookies.containsKey("phone"));
		System.out.println("Phone number: "+cookies.get("phone"));//buscando o valor pela chave
		System.out.println("Buscando chave EMAIL: "+cookies.get("EMAIL"));//buscando uma chave que não tem no conjunto
		System.out.println("Tamanho do conjunto: "+cookies.size());
		
		System.out.println("Imprimindo todos os cookies");
		for(String key : cookies.keySet()) {
			System.out.println(key+":"+cookies.get(key));
		}

	}

}
