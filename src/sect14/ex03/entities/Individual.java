package sect14.ex03.entities;

public final class Individual extends TaxPayer {

	private Double healthExpenses;
	
	public Individual() {}
	public Individual(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}
	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public Double tax() {
		double tax = 0;
		if (anualIncome < 20000) {
			tax += anualIncome * 0.15;
		}
		if (anualIncome >= 20000) {
			tax += anualIncome * 0.25;
		}
		if (healthExpenses > 0) {
			tax -= healthExpenses * 0.5;
		}
		return tax;
	}
}
