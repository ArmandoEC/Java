package entities;

public class BrazilInterestService implements InterestService{
	
	private double InterestRate;

	@Override
	public double getInterestRate() {
		return InterestRate;
	}

	public BrazilInterestService(double interestRate) {
		InterestRate = interestRate;
	}
	
	

}
