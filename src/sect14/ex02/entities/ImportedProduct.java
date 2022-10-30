package sect14.ex02.entities;

public final class ImportedProduct extends Product {

	private Double customFee;
	
	public ImportedProduct() {}
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public Double getCustomFee() {
		return customFee;
	}
	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		return this.name
				+ " $" + String.format("%.2f", this.totalPrice())
				+ " (Customs fee: $" + String.format("%.2f", this.customFee) + ")";
	}
	public Double totalPrice() {
		return this.price + this.customFee;
	}
}
