package sect18.ex02.model.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
