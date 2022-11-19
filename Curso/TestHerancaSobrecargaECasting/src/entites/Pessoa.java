package entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entites_enum.PessoaStatus;

public class Pessoa {
	
	private String nome;
	private int idade;
	private LocalDate dataNascimento;
	protected Double salario;
	
	private PessoaStatus status;
	private List<Cursos> cursos = new ArrayList<>();
	
	public Pessoa() {
		
	}

	
	public Pessoa(String nome, int idade, LocalDate dataNascimento, Double salario, PessoaStatus status) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
		this.status = status;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public PessoaStatus getStatus() {
		return status;
	}

	public void setStatus(PessoaStatus status) {
		this.status = status;
	}

	
	public void addCursos(Cursos e) {
		cursos.add(e);
	}
	
	public void removeCursos(Cursos e) {
		cursos.remove(e);
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String listarCursos() {
		StringBuilder sb = new StringBuilder();
		for(Cursos c: cursos) {
			sb.append(c+"\n");
		}
		return sb.toString();
	}
	
}
