package model.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model_enum.PedidoStatus;

public class Pedido {
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy mm:HH:ss");
	
	private int id;
	private LocalDateTime dtEmissao;
	
	private int idPessoa;
	private PedidoStatus pedidoStatus;
	

	public Pedido(int id, LocalDateTime dtEmissao, int idPessoa,PedidoStatus pedidoStatus) {
		this.id = id;
		this.dtEmissao = dtEmissao;
		this.idPessoa = idPessoa;
		this.pedidoStatus = pedidoStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDtEmissao() {
		return dtEmissao;
	}

	public void setDtEmissao(LocalDateTime dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public PedidoStatus getPedidoStatus() {
		return pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}
	
	@Override
	public String toString() {
		return id+","+dtEmissao.format(fmt1)+","+idPessoa+","+pedidoStatus;
	}
	
	public void salvarPedido(String dados) {
		String pathPedido = "C:\\Users\\pc\\Documents\\workSpace\\Exercícios\\testeFilesMCVpedidos\\TestePedidosMVCFiles\\Pedido.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathPedido))){
			bw.write(dados);
			bw.newLine();
		}
		catch(IOException e) {
			System.out.println("Não foi possivel salvar o pedido. "+"ID: "+id+" "+ e.getMessage());
		}
	}
}
