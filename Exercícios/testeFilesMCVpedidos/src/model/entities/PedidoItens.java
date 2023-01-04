package model.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PedidoItens {
	private double valor;
	private int quantidade;
	private int idPedido;
	private int idProduto;
	
	public PedidoItens(double valor, int quantidade, int idPedido, int idProduto) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.idPedido = idPedido;
		this.idProduto = idProduto;
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

	public int getIdPedido() {
		return idPedido;
	}
	
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	@Override
	public String toString() {
		return valor+","+quantidade+","+idPedido+","+idProduto;
	}
	
	public void salvarPedidoItens(String dados) {
		String pathPedidoItens = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\PedidoItem.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathPedidoItens))){
			bw.write(dados);
			bw.newLine();
			System.out.println("ProdutoItem salvo com sucesso!!!");
		}
		catch(IOException e) {
			System.out.println("Não foi possivel salvar ProdutoItem. "+ e.getMessage());
		}
	}
}
