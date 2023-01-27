package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> strings = Arrays.asList("Maria","Alex","Bob");
		printList(strings);
	}

	public static void printList(List<?> list) {//tipos de funções genericas que podem receber qualquer tipo
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}