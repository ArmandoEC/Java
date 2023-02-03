package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		//equals para comparação é 100% preciso porém mais lento
		//comparação com hash code é muito mais rápido mais é muito raro de acontecer de ser impreciso muito bom para comparações muito grandes

		Client c1 = new Client("Maria","maria@gmail.com");
		Client c2 = new Client("Maria","maria@gmail.com");
		Client c3 = new Client("Bob","bob@gmail.com");

		String a1 = "Maria";
		String a2 = "Maria";
		String a3 = "Bob";
		
		System.out.println(c1.hashCode()); //gerando hash code de um objeto
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));//comparando se c1 é igual c2 
		System.out.println(c1.equals(c3));//comparando se c1 é igual c2 
		System.out.println(c1 == c2);//falso pois essa operação compara a referencia já que é um objeto
		System.out.println(a1==a2); //true pois está comprando uma declaração literal de um valor
		System.out.println(a1==a3); //true pois está comprando uma declaração literal de um valor
	}

}
