package entites;

public class Cursos {
	private int id;
	private String nome;
	private int horas;
	
	public Cursos() {
		
	}

	public Cursos(int id,String nome, int horas) {
		this.id = id;
		this.nome = nome;
		this.horas = horas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: "+id+" - Curso: "+nome+" - Horas: "+horas);
		return sb.toString();
	}
	
	
}
