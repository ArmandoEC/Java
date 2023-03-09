package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x *10); //criando uma stream que multiplica os elementos por 10
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x,y) -> x+y); //criando uma stream que soma os valores do array
		System.out.println(sum);
		
		List<Integer> newList = list.stream()//criando uma pipeline que
				.filter(x -> x% 2 ==0)//filtra os numeros pares
				.map(x -> x*10)//multiplica esses números por 10
				.collect(Collectors.toList());//transforma essa stream em um array
		
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
