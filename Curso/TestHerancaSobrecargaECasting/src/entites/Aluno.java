package entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entites_enum.PessoaStatus;

public class Aluno extends Pessoa{
	private int matricula;
	
	private Sala sala;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Aluno() {
		
	}

	public Aluno(String nome, int idade, LocalDate dataNascimento, Double salario, PessoaStatus status,int matricula) {
		super(nome, idade, dataNascimento, salario, status);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	@Override
	public Double getSalario() {
		return salario - salario * 0.05;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Matrícula: "+matricula);
		sb.append(" - Nome: "+getNome());
		sb.append(" - Status: "+getStatus());
		sb.append(" - Idade: "+getIdade());
		sb.append(" - Data de nascimento: "+getDataNascimento().format(fmt1));
		sb.append(" - Salário: "+getSalario());
		sb.append(" - Sala: "+sala+"\n");
		sb.append("Cursos:\n");
		sb.append(listarCursos());
		return sb.toString();
	}
}
