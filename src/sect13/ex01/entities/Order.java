package sect13.ex01.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sect13.ex01.entities.enums.OrderStatus;

public class Order {

	private LocalDate date;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> order = new ArrayList<>();
	
	public Order() {}
	public Order(LocalDate date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return this.client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	public void addOrderItem(OrderItem item) {
		this.order.add(item);
	}
	public void removeOrderItem(OrderItem item) {
		this.order.remove(item);
	}
	public Double orderTotal() {
		double orderTotal = 0;
		for (OrderItem o : this.order) {
			orderTotal += o.subTotal();
		}
		return orderTotal;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY: ");
		sb.append("\n	Order time: " + this.date);
		sb.append("\n	Order status: " + this.status);
		sb.append("\n	Client: " + this.client.getName());
		sb.append(" (" + this.client.getBirthDate() + ") - " );
		sb.append(this.client.getEmail());
		sb.append("\n\nOrder Items: ");
		for (OrderItem item : order) {
			sb.append("\n	" + item.toString());
		}
		sb.append("\n\nTotal Price: " + String.format("%.2f", orderTotal()));
		return sb.toString();
	}
}
