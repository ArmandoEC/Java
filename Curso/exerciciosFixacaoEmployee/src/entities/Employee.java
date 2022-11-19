package entities;

public class Employee {
	
	public String nome;
	public double salarioBruto;
	public double taxa = 1000.0;
	
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void incrementarSalario(double porcentagem) {
		salarioBruto += salarioBruto * (porcentagem/100);
	}
	
	public String toString() {
		return "Dados atualizados: "
				+String.format("%s", nome)
				+", $ "
				+String.format("%.2f", salarioBruto-taxa);
	}

}
