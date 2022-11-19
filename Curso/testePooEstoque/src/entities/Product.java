package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
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
