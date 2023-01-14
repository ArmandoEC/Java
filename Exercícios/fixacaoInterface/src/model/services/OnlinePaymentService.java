package model.services;

public interface OnlinePaymentService {
	public Double interest(Double amount,Integer mounth);
	public Double paymentFee(Double amount);
}
