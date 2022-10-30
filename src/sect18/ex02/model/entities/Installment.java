package sect18.ex02.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private LocalDate date;
	private Double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment() {}
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return getDate().format(fmt) 
				+ " - " 
				+ String.format("%.2f", getAmount());
	}
}
