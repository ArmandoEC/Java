package testeProdutosEstoque;


public class Produtos {
	private Integer id;
	private String nome;
	private double valor;
	private Integer codFabrica;
	private int estoque;
	

	
	public Produtos(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Produtos(Integer id, String nome, double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	

	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getCodFabrica() {
		return codFabrica;
	}


	public void setCodFabrica(Integer codFabrica) {
		this.codFabrica = codFabrica;
	}
	
	public void adicionarEstoque(int quantidade) {
		this.estoque += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		this.estoque -= quantidade;
	}
	
	public void alterarValor(double valor) {
		this.valor = valor;
	}
	
	public void AlterarValorPerc(double perc) {
		this.valor += valor * (perc/100);
	}
	


	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", valor=" + valor + ", codFabrica=" + codFabrica + ", estoque=" + estoque + "]";
	}
	
	

	
	
}
