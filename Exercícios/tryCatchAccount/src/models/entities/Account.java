package models.entities;

import models.exceptions.DomainExceptions;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimite;
	
	
	public Account(Integer number, String holder, double balance, double withdrawLimite) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimite = withdrawLimite;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}


	public double getWithdrawLimite() {
		return withdrawLimite;
	}


	public void setWithdrawLimite(double withdrawLimite) {
		this.withdrawLimite = withdrawLimite;
	}
	
	public void deposit(double valor) {
		balance+=valor;
	}
	
	public void withdraw(double valor) {
		if(valor > withdrawLimite) {
			throw new DomainExceptions("O valor informado é maior que o limite de saque.");
		}
		else if(valor > balance) {
			throw new DomainExceptions("O valor informado é maior que o saldo.");
		}
		else {
			balance -= valor;
		}
	}
}
