package sect14.ex03.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sect14.ex03.entities.Company;
import sect14.ex03.entities.Individual;
import sect14.ex03.entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		byte n = scan.nextByte();
		
		for (byte i=1; i<=n; i++) {
			System.out.printf("%nTax payer #%d data: %n", i);
			System.out.print("Individual or company (I/C): ");
			scan.nextLine();
			char ic = scan.nextLine().toUpperCase().charAt(0);
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Anual income: ");
			double income = scan.nextDouble();
			if (ic == 'I') {
				System.out.print("Health expenditures: ");
				double healthExp = scan.nextDouble();
				list.add(new Individual(name, income, healthExp));
			} else if (ic == 'C') {
				System.out.print("Number of employees: ");
				int numEmp = scan.nextInt();
				list.add(new Company(name, income, numEmp));
			}
		}
		
		System.out.println("\nTAXES PAID: ");
		for (TaxPayer tp : list) {
			System.out.printf("%n%s: $%.2f", tp.getName(), tp.tax());
		}
		double totalTax = 0;
		for (TaxPayer tp : list) {
			totalTax += tp.tax();
		}
		System.out.printf("%n%nTOTAL TAXES: $%.2f", totalTax);
		
		
		scan.close();
	}
}
