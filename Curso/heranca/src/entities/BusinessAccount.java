package entities;

public class BusinessAccount extends Account{//criando uma herança da superclasse que recebe todos os atributos e métodos
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {//construtor da subclasse com o construtor da superclasse
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) { //acessando um atributo protected balance da super classe
		if(amount <= loanLimit) {
			balance += amount -10.0;
		}
	}
	
}
