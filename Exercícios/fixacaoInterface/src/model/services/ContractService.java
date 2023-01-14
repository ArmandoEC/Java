package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract,Integer months) {
		
		Double installmentValue=contract.getTotalValue()/3;
		
		for(int i=1; i<= months; i++) {

			double interest = paymentService.interest(installmentValue, i);
			double fee = paymentService.paymentFee(installmentValue+interest);
			contract.setInstallment(new Installment(contract.getDate().plusMonths(i), installmentValue+interest+fee));
		}
		
	}
}
