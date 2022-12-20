package model.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model_enum.PessoaStatus;

public class Pessoa {
	private String nome;
	private int id;
	private LocalDate dtCadastro;
	private String dtUltCompra;
	
	private PessoaStatus pessoaStatus;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Pessoa(String nome, int id, LocalDate dtCadastro, String dtUltCompra,PessoaStatus status) {
		this.nome = nome;
		this.id = id;
		this.dtCadastro = dtCadastro;
		this.dtUltCompra = dtUltCompra;
		this.pessoaStatus = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getDtUltCompra() {
		return dtUltCompra;
	}

	public void setDtUltCompra(String dtUltCompra) {
		this.dtUltCompra = dtUltCompra;
	}

	public int getId() {
		return id;
	}

	public PessoaStatus getPessoaStatus() {
		return pessoaStatus;
	}
	

	public void setPessoaStatus(PessoaStatus pessoaStatus) {
		this.pessoaStatus = pessoaStatus;
	}
	
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: "+getId());
		sb.append(" - Status: "+getPessoaStatus());
		sb.append(" - Nome: "+getNome());
		sb.append(" - DtCadastro: "+getDtCadastro().format(fmt1));
		sb.append(" - DtUltCompra: "+getDtUltCompra());
		return sb.toString();
	}

	
	public void salvarPessoa(String dados) {
		String pathPessoa = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Pessoa.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathPessoa))){
			bw.write(dados);
			bw.newLine();
			System.out.println("Pessoa salva com sucesso!!!");
		}
		catch(IOException e) {
			System.out.println("Não foi possivel salvar a pessoa. "+ e.getMessage());
		}
	}

}
