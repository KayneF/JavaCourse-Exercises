package sect08.ex03;

public class EmployeeController {

	public double deployTaxes(Employee e) {
		return e.getSalary() - e.getTaxes();
	}

	public void raiseSalary(Employee e, double percentage) {
		e.setSalary(e.getSalary() + (e.getSalary() * (percentage / 100)));
	}
	
	public void displayInfo(Employee e1, double updatedSalary) {
		System.out.println(""
				+ "\nEmployee information: "
				+ "\nName: " + e1.getName()
				+ "\nGross Salary: " + e1.getSalary()
				+ "\nTaxes: " + e1.getTaxes()
				+ "\nNet Salary: " + updatedSalary
				);
	}
	
}
