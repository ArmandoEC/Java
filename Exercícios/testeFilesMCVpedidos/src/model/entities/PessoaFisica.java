package model.entities;

import java.time.LocalDate;

import model_enum.PessoaStatus;

public class PessoaFisica extends Pessoa{
	private String cpf;
	

	public PessoaFisica(String nome, int id, LocalDate dtCadastro, LocalDate dtUltCompra,PessoaStatus status ,String cpf) {
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
		return getId() + "," + getNome() + "," + cpf + "," +  getDtCadastro()+ "," + getDtUltCompra() + ","+ getPessoaStatus();
	}
	
	

}
