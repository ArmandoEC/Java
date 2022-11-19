package entites;

public class Product {
		public String name;
		public double price;
		public int quantity;
		
		//realizando a sobrecarga com o construtor criando 2 formas além da padrão para inicializar as variáveis
		public Product() {  //construtor padrão sem parâmetros
			
		}
		
		public Product(String name,double price, int quantity) { //contrutor iniciando as variaveis
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public Product(String name,double price) { //construtor que inicia somente nome e preço
			this.name = name;
			this.price= price;
		}
		
		public double TotalInStock() {
			return quantity;
		}
		
		public void addProducts (int quantity) {
			this.quantity += quantity;
		}
		
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
		
		public String toString() {
			return  String.format("\n\nNome do produto: %s", name)
					+String.format("\nValor do produto: %.2f", price)
					+String.format("\nQuantidade em estoque: %d",quantity)
					+"\nValor em estoque: "
					+quantity*price;
		}
}
