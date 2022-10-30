package sect18.ex02.model.services;

import java.time.LocalDate;

import sect18.ex02.model.entities.Contract;
import sect18.ex02.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i=1; i<=months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(interest + basicQuota);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
