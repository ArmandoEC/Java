package boxingUnboxingWrapper;

public class Teste {

	public static void main(String[] args) {

		int x = 20; //cria uma variavel no stack com valor 20
		System.out.println(x);
		
		Object obj = x; //cria um objeto no heap que recebe o valor 20
		System.out.println(obj);
		
		int y = (int) obj; //cria uma variavel no stack que recebe o valor contido no objeto (necessario cast)
		System.out.println(y);
		
		System.out.println("---------------------------------------------");
		
		int a = 20; //cria uma variavel no stack com valor 20
		System.out.println(a);
		
		Integer objeto = a; //cria um objeto com tipo int porém aceita valores nulos de objeto, usado em sistemas da informação
											//pois no banco de dados pode conter campos de valor null e esse tipo tem propriedades de orientacao a objetos
		System.out.println(objeto);
		
		int b = objeto * 2; //cria uma variavel no stack que recebe o valor contido no objeto não é necessário cast pois o objeto é de tipo INT
								//e que inclusive pode ser feito operações com ele
		System.out.println(b);
	}

}
