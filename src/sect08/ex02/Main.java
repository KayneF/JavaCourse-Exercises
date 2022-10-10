package sect08.ex02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		RectangleController rc = new RectangleController();
		
		System.out.println("Enter the rectangle width: ");
		r1.setWidth(scanner.nextDouble());
		System.out.println("Enter the rectangle height: ");
		r1.setHeight(scanner.nextDouble());
		
		scanner.close();
		
		System.out.println("Display rectangle information: ");
		System.out.println("Area: " + rc.calculateArea(r1));
		System.out.println("Perimeter: " + rc.calculatePerimeter(r1));
		System.out.println("Diagonal: " + rc.calculateDiagonal(r1));
		
	}
}
