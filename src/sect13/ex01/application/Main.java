package sect13.ex01.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import sect13.ex01.entities.Client;
import sect13.ex01.entities.Order;
import sect13.ex01.entities.OrderItem;
import sect13.ex01.entities.Product;
import sect13.ex01.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert client information: ");
		System.out.println("Client name: ");
		String clientName = scan.nextLine();
		System.out.println("Client email: ");
		String clientEmail = scan.next();
		System.out.println("Client birthdate: ");
		String  date1 = scan.next();
		LocalDate clientBirthDate = LocalDate.parse(
				date1, DateTimeFormatter.ofPattern("dd/MM/yyy"));
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		
		System.out.print("Order Status: "); 
		OrderStatus orderStatus = OrderStatus.valueOf(scan.next().toUpperCase());
		
		Order order = new Order(LocalDate.now(), orderStatus, client);
		
		System.out.println("Insert the number of items on this order: ");
		int items = scan.nextInt(); scan.nextLine();
		
		for (int i=0; i<items; i++) {
			System.out.println("\nInsert order information: ");
			System.out.print("Product name: "); 
			String productName = scan.next();
			System.out.print("Product price: "); 
			double productPrice = scan.nextDouble();
			System.out.print("Product quantity: "); 
			int productQty = scan.nextInt(); scan.nextLine();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQty, product);
			order.addOrderItem(orderItem);
		}
		
		System.out.println(order);
		
		scan.close();
	}

}
