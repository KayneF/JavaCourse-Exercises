package sect14.ex02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {

	private LocalDate manufactureDate;
	
	public UsedProduct() {}
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/YYYY"); 
		return this.name + " (used)"
				+ " $" + String.format("%.2f", this.price)
				+ " (Manufacture date: " + fmt.format(this.manufactureDate) + ")";
	}
}
