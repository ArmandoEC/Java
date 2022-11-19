package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Aluno;
import entites.Cursos;
import entites.Professor;
import entites.Sala;
import entites_enum.PessoaStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Professor> professores = new ArrayList<>();
		List<Aluno> alunos = new ArrayList<>();
		List<Cursos> cursos = new ArrayList<>();
		List<Sala> salas = new ArrayList<>();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		int loop = 12;
		
		do {
			System.out.println("Selecione um função do menu:");
			System.out.println("1-Cadastrar Professor");
			System.out.println("2-Cadastrar Aluno");
			System.out.println("3-Inativar/Ativar Professor");
			System.out.println("4:Inativar/Ativar Aluno");
			System.out.println("5-Cadastrar curso");
			System.out.println("6-Cadastrar sala");
			System.out.println("7-Listar Professores");
			System.out.println("8-Listar Alunos");
			System.out.println("9-Adicionar sala a um aluno");
			System.out.println("10-Adicionar curso a um aluno");
			System.out.println("11-Adicionar curso a um Professor");
			System.out.println("12-Sair");
			loop = sc.nextInt();
			
			if(loop != 12) {
				
				switch(loop){
					
					case 1:
						System.out.println("Adicione os dados do professor:");
						sc.nextLine();
						System.out.print("NOME:");
						String nome = sc.nextLine();
						System.out.print("IDADE:");
						int idade = sc.nextInt();
						System.out.print("DATA DE NASCIMENTO dd/MM/yyyy:");
						LocalDate dtNascimento = LocalDate.parse(sc.next(),fmt1);
						System.out.print("SALÁRIO:");
						Double salario = sc.nextDouble();
						System.out.print("STATUS (ATIVO,INATIVO):");
						String status = sc.next();
						sc.nextLine();
						System.out.print("Disciplina:");
						String disciplina = sc.nextLine();
						System.out.print("MATRÍCULA:");
						int matricula = sc.nextInt();
						
						Professor e = new Professor(nome,idade,dtNascimento,salario,PessoaStatus.valueOf(status),disciplina,matricula);
						professores.add(e);
						break;
					case 2:
						System.out.println("Adicione os dados do aluno:");
						sc.nextLine();
						System.out.print("NOME:");
						String nome1 = sc.nextLine();
						System.out.print("IDADE:");
						int idade1 = sc.nextInt();
						System.out.print("DATA DE NASCIMENTO dd/MM/yyyy:");
						LocalDate dtNascimento1 = LocalDate.parse(sc.next(),fmt1);
						System.out.print("SALÁRIO:");
						Double salario1 = sc.nextDouble();
						System.out.print("STATUS (ATIVO,INATIVO):");
						String status1 = sc.next();
						System.out.print("MATRÍCULA:");
						int matricula1 = sc.nextInt();
						
						Aluno e1 = new Aluno(nome1,idade1,dtNascimento1,salario1,PessoaStatus.valueOf(status1),matricula1);
						alunos.add(e1);
						break;
					case 3:
						System.out.println("Digite a matrícula do professor que deseja trocar o status:");
						for(Professor c: professores) {
							System.out.println(c);
						}
						int aux = sc.nextInt();
						for(Professor c: professores) {
							if(c.getMatricula() == aux) {
								if(c.getStatus() == PessoaStatus.ATIVO) {
									c.setStatus(PessoaStatus.INATIVO);
								}
								else {
									c.setStatus(PessoaStatus.ATIVO);
								}
							}
						}
						
						System.out.println("Professor Alterado: ");
						for(Professor c: professores) {
							if(c.getMatricula() == aux) {
								System.out.println(c);
							}
						}
						break;
					case 4:
						System.out.println("Digite a matrícula do aluno que deseja trocar o status:");
						for(Aluno c: alunos) {
							System.out.println(c);
						}
						int aux1 = sc.nextInt();
						for(Aluno c: alunos) {
							if(c.getMatricula() == aux1) {
								if(c.getStatus() == PessoaStatus.ATIVO) {
									c.setStatus(PessoaStatus.INATIVO);
								}
								else {
									c.setStatus(PessoaStatus.ATIVO);
								}
							}
						}
						
						System.out.println("Aluno Alterado: ");
						for(Aluno c: alunos) {
							if(c.getMatricula() == aux1) {
								System.out.println(c);
							}
						}
						break;
					case 5:
						System.out.println("Digite os dados do Curso: ");
						System.out.print("ID: ");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.print("Nome: ");
						String nomeCurso = sc.nextLine();
						System.out.print("Horas: ");
						int horas = sc.nextInt();
						
						Cursos addCurso = new Cursos(id,nomeCurso,horas);
						cursos.add(addCurso);
						break;
					case 6:
						System.out.println("Digite os dados da sala: ");
						System.out.print("ID: ");
						int idSala = sc.nextInt();
						System.out.print("Numero: ");
						int numeroSala = sc.nextInt();
						System.out.print("Bloco: ");
						char bloco = sc.next().charAt(0);
						
						Sala addSala = new Sala(idSala,numeroSala,bloco);
						salas.add(addSala);
						break;
					case 7:
						System.out.println("Imprimindo Professores: ");
						for(Professor c: professores) {
							System.out.println(c);
						}
						break;
					case 8:
						System.out.println("Imprimindo Alunos: ");
						for(Aluno c: alunos) {
							System.out.println(c);
						}
						break;
					case 9:
						System.out.println("Digite a matrícula do aluno que deseja alterar a sala:");
						for(Aluno c: alunos) {
							System.out.println(c);
						}
						int alterarSalaAluno = sc.nextInt();
						System.out.println("Digite o id da sala:");
						for(Sala c: salas) {
							System.out.println(c);
						}
						int salaAlterar = sc.nextInt();
						for(Aluno c: alunos) {
							if(c.getMatricula() == alterarSalaAluno) {
								for(Sala a: salas) {
									if(a.getId()==salaAlterar) {
										c.setSala(a);
									}
								}
							}
						}
						
						System.out.println("Aluno Alterado: ");
						for(Aluno c: alunos) {
							if(c.getMatricula() == alterarSalaAluno) {
								System.out.println(c);
							}
						}
						break;
					case 10:
						System.out.println("Digite a matrícula do aluno que deseja adicionar curso:");
						for(Aluno c: alunos) {
							System.out.println(c);
						}
						int alunoCurso = sc.nextInt();
						System.out.println("Digite o id do curso:");
						for(Cursos c: cursos) {
							System.out.println(c);
						}
						int cursoAdd = sc.nextInt();
						for(Aluno c: alunos) {
							if(c.getMatricula() == alunoCurso) {
								for(Cursos a: cursos) {
									if(a.getId()==cursoAdd) {
										c.addCursos(a);
									}
								}
							}
						}
						
						System.out.println("Aluno Alterado: ");
						for(Aluno c: alunos) {
							if(c.getMatricula() == alunoCurso) {
								System.out.println(c);
							}
						}
						break;
					case 11:
						System.out.println("Digite a matrícula do professor que deseja adicionar curso:");
						for(Professor c: professores) {
							System.out.println(c);
						}
						int professorCurso = sc.nextInt();
						System.out.println("Digite o id do curso:");
						for(Cursos c: cursos) {
							System.out.println(c);
						}
						int cursoAddP = sc.nextInt();
						for(Professor c: professores) {
							if(c.getMatricula() == professorCurso) {
								for(Cursos a: cursos) {
									if(a.getId()==cursoAddP) {
										c.addCursos(a);
									}
								}
							}
						}
						
						System.out.println("Professor Alterado: ");
						for(Professor c: professores) {
							if(c.getMatricula() == professorCurso) {
								System.out.println(c);
							}
						}
						break;
				}
			}
			
		}while(loop != 12);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
