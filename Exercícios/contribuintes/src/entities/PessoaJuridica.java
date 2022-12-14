package entities;

public class PessoaJuridica extends Contribuintes{
	private Integer numFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public double taxaImposto() {
		if(numFuncionarios > 10) {
			return getRendaAnual()*0.14;
		}
		else {
			return getRendaAnual()*0.16;
		}
	}
	
	@Override
	public String toString() {
		return getNome() + " $ "+taxaImposto();
	}
	
}
