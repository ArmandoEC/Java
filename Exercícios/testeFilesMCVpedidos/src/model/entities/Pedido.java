package model.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model_enum.PedidoStatus;

public class Pedido {
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
	
}
