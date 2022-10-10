package sect13.ex01.entities;

public class OrderItem {

	private Integer qty;
	private Product product;
	
	public OrderItem() {}
	public OrderItem(Integer quantity, Product product) {
		this.qty = quantity;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return qty;
	}
	public void setQty(Integer quantity) {
		this.qty = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	
	public Double subTotal() {
		return product.getPrice() * this.qty;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append("$" + String.format("%.2f", product.getPrice()) + ", ");
		sb.append("Qty: " + this.qty + ", ");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}
}
