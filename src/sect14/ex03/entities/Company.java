package sect14.ex03.entities;

public final class Company extends TaxPayer {

	private Integer numberOfEmplyees;
	
	public Company() {}
	public Company(String name, Double anualIncome, Integer numberOfEmplyees) {
		super(name, anualIncome);
		this.numberOfEmplyees = numberOfEmplyees;
	}
	
	public Integer getNumberOfEmplyees() {
		return numberOfEmplyees;
	}
	public void setNumberOfEmplyees(Integer numberOfEmplyees) {
		this.numberOfEmplyees = numberOfEmplyees;
	}
	
	@Override
	public Double tax() {
		double tax = 0;
		if (numberOfEmplyees <= 10) {
			tax += anualIncome * 0.16;
		}
		if (anualIncome > 10) {
			tax += anualIncome * 0.14;
		}
		return tax;
	}
}
