package entities;

import java.security.InvalidAlgorithmParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment(double amount, int months) throws InvalidAlgorithmParameterException {
		
		if(months<1) {
			throw new InvalidAlgorithmParameterException("Months must be greater than 0");
		}
		return amount * Math.pow(1.0 + getInterestRate()/100.0, months);
	}
}
