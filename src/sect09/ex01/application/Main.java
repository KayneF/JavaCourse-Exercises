package sect09.ex01.application;

import java.util.Locale;
import java.util.Scanner;

import sect09.ex01.entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		// Account creation
		System.out.println("Enter account number: ");
		long accNumber = scanner.nextInt();
		System.out.println("Enter account hoder's name: ");
		scanner.nextLine();
		String accHolder = scanner.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String fb = scanner.nextLine().toLowerCase();
		if (fb.equals("y")) {
			System.out.println("Enter the initial deposit value: ");
			double initialDeposit = scanner.nextDouble();
			account = new Account(accNumber, accHolder, initialDeposit);
		} else {
			account = new Account(accNumber, accHolder);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		// Deposit
		System.out.print("\nEnter a deposit value: ");
		double depositValue = scanner.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		// Withdraw
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = scanner.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		scanner.close();
	}
}
