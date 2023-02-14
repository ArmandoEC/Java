package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union, unindo os dois conjuntos
		Set<Integer> c = new TreeSet<>(a); //declarando um novo conjunto recebendo a coleção de a
		c.addAll(b); //adicionando os valores do conjunto b, os valores não se repetem
		System.out.println(c);
		
		
		//Intersection 
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); //adicionando os elementos que tem em comun nos dois conjuntos
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); //retirando do conjunto todos os elementos de um que correspondem em outro
		System.out.println(e);
	}

}
