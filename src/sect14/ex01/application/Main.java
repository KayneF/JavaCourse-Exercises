package sect14.ex01.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sect14.ex01.entities.Employee;
import sect14.ex01.entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of Employeed: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("%nEmployee #%d data: %n", i);
			System.out.print("Outsourced (y/n)? ");
			char os = scan.next().toLowerCase().charAt(0);
			scan.nextLine();	// BREAK
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Working hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double value = scan.nextDouble();
			if (os == 'y') {
				System.out.print("Additional charge: ");
				double charge = scan.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, value, charge));
			} else if (os == 'n') {
				list.add(new Employee(name, hours, value));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee e : list) {
			System.out.println(e.getName() + " - " + " $" 
					+ String.format("%.2f", e.payment()));
		}
		
		scan.close();
	}

}
