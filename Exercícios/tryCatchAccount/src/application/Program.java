package application;

import java.util.Locale;
import java.util.Scanner;

import models.entities.Account;
import models.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Entre com os dados da conta:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Entre com o valor de saque: ");
			double valor = sc.nextDouble();
			account.withdraw(valor);
			System.out.println("New balance: "+account.getBalance());
		}
		catch(DomainExceptions e){
			System.out.println("Withdraw erro: "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
