package sect10.ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		byte n = scan.nextByte();
		
		for (byte i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.println("ID: ");
			Integer id = scan.nextInt();
			while (EmpController.hasId(list, id)) {
				System.err.println("ID already taken! Try another ID number. ");
				id = scan.nextInt();
			}
			System.out.println("Name: "); scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Salary: ");
			double salary = scan.nextDouble();
			Employee e = new Employee(id, name, salary);
			list.add(e);
		}
		
		System.out.println("Enter the employee ID that will have an increase: ");
		Employee emp;
		do {
			int idRaise = scan.nextInt();
			emp = list.stream().filter(x -> x.getId() == idRaise).findFirst().orElse(null);
			if (emp == null) {
				System.err.println("This employee ID does not exists. Try again: ");
			} else {
				System.out.println("Enter the raise percentage: ");
				emp.raiseSalaryByPercentage(scan.nextDouble());
			} 
		} while (emp == null);
			
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}
		
		scan.close();
	}

}
