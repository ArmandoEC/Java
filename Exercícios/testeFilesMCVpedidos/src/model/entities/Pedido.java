package model.entities;

import java.time.LocalDateTime;

import model_enum.PedidoStatus;

public class Pedido {
	private int id;
	private LocalDateTime dtEmissao;
	
	private Pessoa idPessoa;
	private PedidoStatus pedidoStatus;

	public Pedido(int id, LocalDateTime dtEmissao, Pessoa idPessoa,PedidoStatus pedidoStatus) {
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

	public Pessoa getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}

	public PedidoStatus getPedidoStatus() {
		return pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}
	
}
