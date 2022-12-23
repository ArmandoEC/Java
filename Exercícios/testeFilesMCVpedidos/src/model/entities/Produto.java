package model.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Produto {
	private int id;
	private String nome;
	private double valor;
	
	public Produto(int id, String nome, double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
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

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id +","+ nome + "," + valor;
	}
	
	public void salvarProduto(String dados) {
		String pathProduto = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Produto.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathProduto))){
			bw.write(dados);
			bw.newLine();
			System.out.println("Produto salvo com sucesso!!!");
		}
		catch(IOException e) {
			System.out.println("Não foi possivel salvar a pessoa. "+ e.getMessage());
		}
	}
	

	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: "+id);
		sb.append(" / Nome: "+nome);
		sb.append(" / Valor: "+valor);

		return sb.toString();
	}
	

}
