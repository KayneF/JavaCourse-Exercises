package sect09.ex01.entities;

public class Account {

	private long accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account(long number, String holder) {
		this.accountNumber = number;
		this.accountHolder = holder;
	}
	
	public Account(long number, String holder, double initDep) {
		this.accountNumber = number;
		this.accountHolder = holder;
		deposit(initDep);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	
	public void withdraw(double amount) {
		this.accountBalance -= amount;
	}
	
	public String toString() {
		return "Account information: "
				+ "\n	Account: " 
				+ this.accountNumber
				+ "\n	Holder's name: " 
				+ this.accountHolder
				+ "\n	Total balance: " 
				+ String.format("%.2f", accountBalance)
				;
	}
	
}
