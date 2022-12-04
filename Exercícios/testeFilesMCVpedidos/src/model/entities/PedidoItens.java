package model.entities;

import java.util.ArrayList;
import java.util.List;

public class PedidoItens {
	private double valor;
	private int quantidade;
	
	private Pedido idPedido;
	private List<Produto> produtos = new ArrayList<>();
	
	public PedidoItens(double valor, int quantidade, Pedido idPedido, List<Produto> produtos) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.idPedido = idPedido;
		this.produtos = produtos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getIdPedido() {
		return idPedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void addItem(Produto e) {
		produtos.add(e);
	}
	
	public void removerItem(Produto e) {
		produtos.remove(e);
	}
}
