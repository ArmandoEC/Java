package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import models.entities.CarRental;
import models.entities.Vehicle;
import models.services.BrazilTaxService;
import models.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter whith the car datas:");
		System.out.println("Car model:");
		String model = sc.nextLine();
		System.out.println("Entre com a data de retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime dtRetirada = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.println("Entre com a data de retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime drRetorno = LocalDateTime.parse(sc.nextLine(),fmt);
		
		CarRental cr = new CarRental(dtRetirada, drRetorno, new Vehicle(model));
		
		System.out.println("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: "+cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: "+cr.getInvoice().getTax());
		System.out.println("Pagamento total: "+cr.getInvoice().getTotalPayment());
		
		
		
		
		sc.close();

	}

}
