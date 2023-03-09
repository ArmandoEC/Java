package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,4,5,6,7); //declarando uma stram a partir de um array
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria","Alex","Bob"); //declarando uma stream com stream of
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); //declarando um array com um predicado
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new  Long[] {0L,1L}, p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);//declarando um array que faça o calculo 
			System.out.println(Arrays.toString(st4.limit(10).toArray()));										//da sequencia de fibonacci

	}

}
