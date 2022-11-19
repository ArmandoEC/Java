package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Entre com o nome do empregado: ");
		employee.nome = sc.nextLine();
		
		System.out.print("Entre com o salário bruto");
		employee.salarioBruto = sc.nextDouble();
		
		System.out.println("Empregado: "
			+employee.nome
			+", $ "
			+employee.salarioLiquido()
		);
		
		System.out.print("Entre com a porcentagem de aumento de salário: ");
		employee.incrementarSalario(sc.nextInt());
		
		System.out.println(employee);
		
		sc.close();

	}

}
