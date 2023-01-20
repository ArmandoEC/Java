package application;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.Scanner;

import entities.InterestService;
import entities.USAInterestService;

public class Program {

	public static void main(String[] args) throws InvalidAlgorithmParameterException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		Double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService interestService = new USAInterestService(1.0);
		
		double payment = interestService.payment(amount, months);
		
		System.out.println("Payment after "+months+" months: ");
		System.out.println(String.format("%.2f",payment));
		
		
		sc.close();

	}

}
