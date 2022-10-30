package sect18.ex02.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import sect18.ex02.model.entities.Contract;
import sect18.ex02.model.entities.Installment;
import sect18.ex02.model.services.ContractService;
import sect18.ex02.model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = scan.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(scan.next(), fmt);
		System.out.print("Contract value: ");
		double value = scan.nextDouble();
		
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Enter the number of installments: ");
		int n = scan.nextInt();
		
		ContractService contractService = 
				new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		
		System.out.println("Installments: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		scan.close();
	}

}
