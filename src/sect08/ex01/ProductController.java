package sect08.ex01;

public class ProductController {

	public void addUnits(Product p1, int addedUnits) {
		p1.setUnits(p1.getUnits() + addedUnits);
	}
	
	public void removeUnits(Product p1, int removedUnits) {
		p1.setUnits(p1.getUnits() - removedUnits);
	}

	public double calculateTotalPrice(int units, double price) {
		double totalPrice = units * price;
		return totalPrice;
	}
	
}
