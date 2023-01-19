package application;

import model.entities.ComboDevice;

public class Program {

	public static void main(String[] args) {
		
		ComboDevice multifuncional = new ComboDevice("50601");
		
		System.out.println(multifuncional.printer());
		System.out.println(multifuncional.scan());
		System.out.println();
		multifuncional.processDoc("Print+scan");

	}

}
