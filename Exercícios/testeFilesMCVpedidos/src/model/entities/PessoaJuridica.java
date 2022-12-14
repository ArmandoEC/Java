package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model_enum.PessoaStatus;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public PessoaJuridica(String nome, int id, LocalDate dtCadastro, String dtUltCompra,PessoaStatus status , String cnpj) {
		super(nome, id, dtCadastro, dtUltCompra, status);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return getId() + "," + getNome() + "," + cnpj + "," +  getDtCadastro().format(fmt1)+ "," + getDtUltCompra() + ","+ getPessoaStatus();
	}
	
	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: "+getId());
		sb.append(" / Status: "+getPessoaStatus());
		sb.append(" / Nome: "+getNome());
		sb.append(" / CNPJ: "+getCnpj());
		sb.append(" / DtCadastro: "+getDtCadastro().format(fmt1));
		sb.append(" / DtUltCompra: "+getDtUltCompra());
		return sb.toString();
	}
}
