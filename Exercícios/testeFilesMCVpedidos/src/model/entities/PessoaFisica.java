package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model_enum.PessoaStatus;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public PessoaFisica(String nome, int id, LocalDate dtCadastro, String dtUltCompra,PessoaStatus status ,String cpf) {
		super(nome, id, dtCadastro, dtUltCompra, status);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return getId() + "," + getNome() + "," + cpf + "," +  getDtCadastro().format(fmt1)+ "," + getDtUltCompra() + ","+ getPessoaStatus();
	}
	
	

}
