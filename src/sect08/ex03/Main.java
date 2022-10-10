package sect08.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double updatedSalary;
		Scanner scanner = new Scanner(System.in);
		Employee e1 = new Employee();
		EmployeeController ec = new EmployeeController();
		
		System.out.println("Insert employee information: ");
		System.out.println("Name: ");
		e1.setName(scanner.nextLine());
		System.out.println("Salary: ");
		e1.setSalary(scanner.nextDouble());
		System.out.println("Taxes: ");
		e1.setTaxes(scanner.nextDouble());
		
		ec.displayInfo(e1, e1.getSalary());
		
		System.out.println("\nWhich percentage to increase salary: ");
		double percentage = scanner.nextDouble();

		ec.raiseSalary(e1, percentage);
		updatedSalary = ec.deployTaxes(e1);
		
		ec.displayInfo(e1, updatedSalary);
		
		scanner.close();
	}
}
