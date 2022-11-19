package entites;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public String toString() {
		double resultado = nota1 + nota2 + nota3;
		
		if(resultado>=60) {
			
			return String.format("Aluno %s\n", nome)
					+String.format("FINAL GRADE = %.2f\n",resultado)
					+"PASS";
			
		}else {
			
			return String.format("Aluno %s\n", nome)
					+String.format("FINAL GRADE = %.2f\n",resultado)
					+"FAILED"
					+String.format("MISSING %.2f POINTS", 60-resultado);
		}
	}
}
