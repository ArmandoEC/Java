package model.entities;

public class Projeto {

	private Double valorProjeto;
	private Double horasAdicionais;
	private Double valorHora;
	
	private Cliente cliente;
	private Implantador implantador;
	public Projeto(Double valorProjeto, Double horasAdicionais, Double valorHora, Cliente cliente,Implantador implantador) {
		this.valorProjeto = valorProjeto;
		this.horasAdicionais = horasAdicionais;
		this.valorHora = valorHora;
		this.cliente = cliente;
		this.implantador = implantador;
	}
	
	public Double getValorProjeto() {
		return valorProjeto;
	}
	public void setValorProjeto(Double valorProjeto) {
		this.valorProjeto = valorProjeto;
	}
	public Double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(Double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	public Double getValorHora() {
		return valorHora;
	}
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Implantador getImplantador() {
		return implantador;
	}
	public void setImplantador(Implantador implantador) {
		this.implantador = implantador;
	}
	
	
}
