package model.entities;

public class ComboDevice extends Device implements Scanner,Printer{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String printer() {
		return "Printing...";
	}

	@Override
	public String scan() {
		return "Scanning...";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println(doc +" - Documento processado!!!");
		
	}
	
}
