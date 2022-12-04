package model.entities;

import java.time.LocalDate;

import model_enum.PessoaStatus;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome, int id, LocalDate dtCadastro, LocalDate dtUltCompra,PessoaStatus status , String cnpj) {
		super(nome, id, dtCadastro, dtUltCompra, status);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
