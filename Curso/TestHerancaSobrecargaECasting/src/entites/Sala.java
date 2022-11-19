package entites;

public class Sala {
	private int id;
	private int numero;
	private char bloco;
	
	public Sala() {
		
	}

	public Sala(int id,int numero, char bloco) {
		this.id = id;
		this.numero = numero;
		this.bloco = bloco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getBloco() {
		return bloco;
	}

	public void setBloco(char bloco) {
		this.bloco = bloco;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: "+id+" - Sala : "+numero+bloco);
		return sb.toString();
	}
	
	
}
