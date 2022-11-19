package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteList {

	public static void main(String[] args) {

		//criando uma lista e instanciando com o tipo arraylist (precisa sempre ser instanciado)
		List<String> list = new ArrayList<>();
		
		list.add("Maria");//adicionando valores a lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marcos"); //adicionando na posição 2 da lista (ele joga os outros valores para os proximos arrays)
		
		System.out.println(list.size()); //imprimindo o tamanho da lista
		
		for(String x : list) {			//imprimindo os valores contidos na lista
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------");
		
		list.remove("Maria"); //removendo com comparações de valor
		list.remove(2); //removendo a posição 2 do arraylist
		list.removeIf(x -> x.charAt(0) == 'M'); //removendo com lambda aonde a primeira letra é M
		
		for(String x : list) {			//imprimindo os valores contidos na lista
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Index of Alex "+list.indexOf("Alex")); //imprimindo a posicao pela comparação de string -1 caso não exista
		System.out.println("Index of Marco "+list.indexOf("Marco"));
		System.out.println("---------------------------------------------------");
		//Criando uma nova lista para receber os arrays de lista aonde os nomes começem com A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		for(String x : result) {			//imprimindo os valores contidos na lista
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------");
		
		//pegando o primeiro registro da lista aonde o nome começe com J e retorna null caso não tenha
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
