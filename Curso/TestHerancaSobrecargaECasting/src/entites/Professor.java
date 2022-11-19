package entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entites_enum.PessoaStatus;

public class Professor extends Pessoa{
	
	private int matricula;
	private String disciplina;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Professor() {
	
	}

	public Professor(String nome, int idade, LocalDate dataNascimento, Double salario, PessoaStatus status,
			String disciplina,int matricula) {
		super(nome, idade, dataNascimento, salario, status);
		this.disciplina = disciplina;
		this.matricula = matricula;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	public int getMatricula() {
		return matricula;
	}


	@Override
	public Double getSalario() {
		return salario - salario * 0.1;
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
		sb.append(" - Disciplina: "+disciplina+"\n");
		sb.append("Cursos:\n");
		sb.append(listarCursos());
		return sb.toString();
	}
	
	
}
