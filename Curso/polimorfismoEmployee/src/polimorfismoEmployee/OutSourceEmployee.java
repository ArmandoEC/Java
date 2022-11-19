package polimorfismoEmployee;

public class OutSourceEmployee extends Employee {
	private Double additionalCharge;
	
	public OutSourceEmployee(String name, Integer hours, double valuePerHour,double additionalCharge) {
		super(name,hours,valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}



	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}


	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+" - $ "+payment());
		return sb.toString();
	}
	
	

}
