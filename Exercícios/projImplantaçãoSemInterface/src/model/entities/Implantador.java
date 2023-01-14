package model.entities;

public class Implantador {
	private String nome;
	private Double perComissao;
	
	public Implantador(String nome, Double perComissao) {
		this.nome = nome;
		this.perComissao = perComissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPerComissao() {
		return perComissao;
	}

	public void setPerComissao(Double perComissao) {
		this.perComissao = perComissao;
	}
	
	
}
