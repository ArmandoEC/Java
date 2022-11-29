package models.services;

import java.time.Duration;

import models.entities.CarRental;
import models.entities.Invoice;

public class RentalService {
	private double pricePerHour;
	private double pricePerDay;
	
	private BrazilTaxService TaxService;


	public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService TaxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.TaxService = TaxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
		double hours = minutes/60;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours/24);
		}
		
		double tax = TaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	
}
