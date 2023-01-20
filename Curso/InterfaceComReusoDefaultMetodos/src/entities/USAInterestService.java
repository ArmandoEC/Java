package entities;

public class USAInterestService implements InterestService{
	
	private double InterestRate;

	@Override
	public double getInterestRate() {
		return InterestRate;
	}

	public USAInterestService(double interestRate) {
		InterestRate = interestRate;
	}
	
}
