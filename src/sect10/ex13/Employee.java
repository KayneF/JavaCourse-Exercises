package sect10.ex13;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void raiseSalaryByValue(Double salary) {
		this.salary += salary;
	}
	public void raiseSalaryByPercentage(Double percentage) {
		this.salary += (this.salary * percentage / 100);
	}
	
	public String toString() {
		return "ID: " + this.id
				+ "\nName: " + this.name
				+ "\nSalary: " + String.format("%.2f", this.salary);
	}
}
