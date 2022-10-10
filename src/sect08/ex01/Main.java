package sect08.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		int addedUnits, removedUnits;
		Scanner scanner = new Scanner(System.in);
		
		Product p1 = new Product();
		ProductController pc = new ProductController();
		
		
		System.out.println("******** Creating new product ******** ");
		System.out.println("Enter product data: ");
		System.out.println("Product name: ");
		p1.setName(scanner.nextLine());
		System.out.println("Product price: ");
		p1.setPrice(scanner.nextDouble());
		System.out.println("Units available: ");
		p1.setUnits(scanner.nextInt());
		
		System.out.println(p1);
		
		System.out.println("\nDo you like to add more units? (type a value):");
		pc.addUnits(p1, scanner.nextInt());
		
		System.out.println(p1);
		
		System.out.println("\nDo you like to remove units? (type a value):");
		pc.removeUnits(p1, scanner.nextInt());
		
		System.out.println(p1);
		
		scanner.close();
		
//		pc.toString(
//				pc.calculateTotalPrice(p1.getUnits(), p1.getPrice()), 
//				p1);
//		
//		addedUnits = 5;
//		pc.addUnits(p1, addedUnits);
//		pc.getResults(
//				pc.calculateTotalPrice(p1.getUnits(), p1.getPrice()), 
//				p1);
//		
//		removedUnits = 3;
//		pc.removeUnits(p1, removedUnits);
//		pc.getResults(
//				pc.calculateTotalPrice(p1.getUnits(), p1.getPrice()), 
//				p1);
	}
}
