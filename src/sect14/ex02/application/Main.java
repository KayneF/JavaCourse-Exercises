package sect14.ex02.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sect14.ex02.entities.ImportedProduct;
import sect14.ex02.entities.Product;
import sect14.ex02.entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scan.nextInt(); scan.nextLine();
		for (int i=1; i<=n; i++) {
			System.out.printf("%nProduct #%d data: %n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char imported = scan.nextLine().toLowerCase().charAt(0);
			System.out.print("Product name: ");
			String name = scan.nextLine();
			System.out.print("Product price: ");
			double price = scan.nextDouble(); scan.nextLine();
			if (imported == 'c') {
				list.add(new Product(name, price));
			} else if (imported == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = scan.nextLine(); 
				LocalDate date = LocalDate.parse(
						dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else if (imported == 'i') {
				System.out.print("Customs fee: ");
				double fee = scan.nextDouble(); scan.nextLine();
				list.add(new ImportedProduct(name, price, fee)); 
			}
		}
		
		System.out.println("\nPRICE TAGS: ");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		scan.close();
	}
}
