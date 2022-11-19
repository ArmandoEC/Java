package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING - fazer com que um superclasse receba uma subclasse
		
		Account acc1 = bacc; //é possível por que uma superclasse em subclasse
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 1000.0);
		//acc2.loan(); porém não é possivel chamar o método de BusinessAccount por que Account não possui esse método
		Account acc3 = new SavingsAccount(1004, "Carla", 0.0, 0.01);
		
		//DOWNCASTING - CONVERTER UMA SUBCLASSE EM SUPERCLASSE
		
		//BusinessAccount acc4 = acc2; //não é possivel
		BusinessAccount acc4 = (BusinessAccount)acc2; //possível somente com conversão forçada com casting
		acc4.loan(100);//possivel chamar pois foi feito o casting
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; //o compilador não reclama, porém o acc3 é declarado como SavingsAccount
		//Só que ela não é uma subclasse de BusinessAccount então é uma conversão inválida, isso irá gerar erro na execução
		
		
		if(acc3 instanceof BusinessAccount) { //instace off testa se uma variavel é uma instancia de um objeto
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
