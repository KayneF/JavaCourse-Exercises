package sect08.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double dollarPrice;
		double amount;
		double totalPaid;
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dollar price: ");
		dollarPrice = scanner.nextDouble();
		System.out.println("How many Dollars will be bought: ");
		amount = scanner.nextDouble();
		
		totalPaid = Utility.currencyConverter(dollarPrice, amount);
		
		System.out.printf("\nDollar price in BRL: R$ %.2f", dollarPrice);
		System.out.printf("\nAmount of US$ bought: R$ %.2f", amount);
		System.out.printf("\nAmount to be paid in BRL(included taxes): R$ %.2f", totalPaid);
		
		scanner.close();
	}

}
