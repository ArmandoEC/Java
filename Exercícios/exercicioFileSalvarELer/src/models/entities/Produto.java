package models.entities;

public class Produto {
	private String nome;
	private double valor;
	private Integer quantidade;
	
	
	public Produto() {
		
	}


	public Produto(String nome, double valor, Integer quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return nome+","+String.format("%.2f", valor)+","+quantidade;
	}
	
	
}
