package sect15.application;

import java.util.Locale;
import java.util.Scanner;

import sect15.model.entities.Account;
import sect15.model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();

		// ACCOUNT CREATION ----------------------------------------
		try {
			System.out.println("Enter the account data: ");
			System.out.print("Account number: ");
			int number = scan.nextInt();
			System.out.print("Account holder's name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Account's initial balance: $");
			double balance = scan.nextDouble();
			System.out.print("Account's withdraw limit: $");
			double limit = scan.nextDouble();

			acc = new Account(number, name, balance, limit);
			System.out.println("Account creation successful! ");
			System.out.println(acc);

			// WITHDRAW ATTEMPT ----------------------------------------
			System.out.print("\nEnter amount to withdraw: ");
			acc.withdraw(scan.nextDouble());
			System.out.println("Balance updated: $"
					+ String.format("%.2f", acc.getBalance()));
		}
		catch (RuntimeException e) {
			System.err.println("Invalid input type on field. ");
		}
		catch (DomainException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		scan.close();
	}

}
