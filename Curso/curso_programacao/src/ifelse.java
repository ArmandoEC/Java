import java.util.Locale;
import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x;
		
		System.out.println("Que horas são?");
		
		x = sc.nextInt();
		
		if(x < 12) {
			System.out.printf("Agora são %d horas, bom dia!\n",x);
		}
		else if(x >12 && x < 18) {
			System.out.printf("Agora são %d horas, boa tarde!\n",x);
		}
		else {
			System.out.printf("Agora são %d horas, boa noite!\n",x);
		}
		
		String nome;
		double y;
		double a;
		double b;
		double result;
		System.out.println("Qual o nome do aluno?");
		
		nome = sc.next();
		
		System.out.println("Qual a primeira nota de "+nome);
		
		y = sc.nextDouble();
		
		System.out.println("Qual a segunda nota de "+nome);
		
		a = sc.nextDouble();
		
		System.out.println("Qual a terceira nota de "+nome);
		
		b = sc.nextDouble();
		
		result = (y+a+b)/3;
		
		if(result < 60) {
			System.out.printf("A nota do aluno %s é %.2f, portanto está REPROVADO!!!",nome,result);
		}
		else if(result == 60) {
			System.out.printf("A nota do aluno %s é %.2f, portanto está APROVADO!!! Com nota azul",nome,result);
		}
		else {
			System.out.printf("A nota do aluno %s é %.2f, portanto está APROVADO!!!",nome,result);
		}
		
		sc.close();

	}

}
