import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int x;
		String diaSemana;
		
		System.out.println("Digite o dia da semana: ");
		x = sc.nextInt();
		
		switch(x){
		
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda";
			break;
		case 3:
			diaSemana = "Terça";
			break;
		case 4:
			diaSemana = "Quarta";
			break;
		case 5:
			diaSemana = "Quinta";
			break;
		case 6:
			diaSemana = "Sexta";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Valor inválido";
			break;
		}
		
		System.out.println("Olá o dia da semana é "+diaSemana);
		
		sc.close();

	}

}
