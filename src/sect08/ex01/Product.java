package sect08.ex01;

public class Product {

	private String name;
	private int units;
	private double price;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "\nProduct name: " + this.name
				+ "\nAvailable units: " + this.units
				+ "\nPrice per unit: $" + String.format("%.2f", this.price)
				+ "\nTotal price in stock: $" + String.format("%.2f", this.price * this.units);
	}
}
