package model.services;

import model.entities.Projeto;

public class CalcularComissao {
	
	
	public CalcularComissao() {
		
	}
	
	public Double processarComissao(Projeto projeto) {
		
		return (projeto.getValorProjeto()*projeto.getImplantador().getPerComissao())+
				((projeto.getValorHora()*projeto.getHorasAdicionais())*projeto.getImplantador().getPerComissao());
	}
	
}
