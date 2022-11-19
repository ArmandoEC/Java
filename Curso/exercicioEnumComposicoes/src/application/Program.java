package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		System.out.println("Entre com o nome do departamento");
		String departamento = sc.next();
		System.out.println("Entre com os dados do trabalhador");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Salário Base: ");
		double salario = sc.nextDouble();
		
		Worker worker = new Worker(nome,WorkerLevel.valueOf(level),salario,new Departament(departamento));
		
		System.out.print("Quantos contratos tem esse trabalhador? ");
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			System.out.printf("Entre com o contrato %d\n",i+1);
			System.out.print("Data (DD/MM/yyyy): ");
			LocalDate data = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração: ");
			int duracao = sc.nextInt();
			HourContract c = new HourContract(data,valorPorHora,duracao);
			worker.addContract(c);
		}
		
		System.out.print("Entre com o mês e o ano para calcular o salário: (MM/yyyy) ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Nome: "+ worker.getName());
		System.out.println("Departament: "+ worker.getDepartament().getName());
		System.out.println("Income for: "+ monthYear+ ": " + worker.income(year, month));
		sc.close();
		
	}
	
	

}
