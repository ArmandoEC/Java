package model.services;

public class PaypalService implements OnlinePaymentService{
	
	public PaypalService() {
		
	}
	
	public Double interest(Double amount,Integer mounth) {
		return amount*(0.01*mounth);
	}
	public Double paymentFee(Double amount) {
		return amount*0.02;
	}
	
}
