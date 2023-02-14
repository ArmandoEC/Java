package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();//declarando com HashSet, o tipo mais rapido, que não garante uma ordem
		
		set.add("Tv"); //adicionando dados a lista
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook")); //testando se existe um elemento dentro da interface generica Set
		
		for(String p: set) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------------------------");
		Set<String> set1 = new TreeSet<>();//declarando com TreeSet, o tipo mais lento, que ordena os dados
		
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		
		for(String p: set1) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------------------------");
		Set<String> set2 = new LinkedHashSet<>();//declarando com LinkedHashSet, o tipo mediado em velocidade, sua ordem é a de inserção
		
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");
		
		for(String p: set2) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------------------------");
		Set<String> set3 = new LinkedHashSet<>();//declarando com LinkedHashSet, o tipo mediado em velocidade, sua ordem é a de inserção
		
		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");
		
		set3.remove("Notebook"); //removendo um dado da lista
		
		for(String p: set3) {
			System.out.println(p);
		}
		
		
		System.out.println("----------------------------------------------");
		Set<String> set4 = new LinkedHashSet<>();//declarando com LinkedHashSet, o tipo mediado em velocidade, sua ordem é a de inserção
		
		set4.add("Tv");
		set4.add("Tablet");
		set4.add("Notebook");
		
		set4.removeIf(x -> x.charAt(0)=='T'); //removendo um dado da lista todos os strings que começem com T
		
		for(String p: set4) {
			System.out.println(p);
		}
	}

}
