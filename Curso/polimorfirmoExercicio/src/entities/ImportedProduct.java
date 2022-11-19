package entities;

public class ImportedProduct extends Product{
	private double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFree) {
		super(name, price);
		this.customsFee = customsFree;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFree(double customsFree) {
		this.customsFee = customsFree;
	}

	public double totalPrice() {
		return getPrice()+getCustomsFee();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+" $ "+totalPrice());
		sb.append(" (Customs fee: $ "+customsFee+")");
		return sb.toString();
	}
	
	
}
