package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o total de parcelas: ");
		Integer parcelas = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, parcelas);
		
		
		System.out.println("Parcelas:");
		
		for(Installment e: contract.getInstallment() ) {
			System.out.println(e.getDueDate().format(fmt) + " - " + e.getAmount());
		}
		
		
		
		
		
		
		sc.close();

	}

}
