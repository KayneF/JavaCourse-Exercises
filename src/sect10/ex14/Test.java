package sect10.ex14;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		byte negativeCounter = 0;
		byte counter = 0;
		
		System.out.println("Type the matrix size (in integer numbers): ");
		byte n = scan.nextByte();
		
		Integer[][] matrix = new Integer[n][n]; 
		
		for (byte i=0; i<matrix.length; i++) {
			for (byte j=0; j<matrix[i].length; j++) {
				System.out.printf("Type the %do number in line %d: ", i+1, j+1);
				matrix[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println("\nAll numbers in the matrix: " + Arrays.deepToString(matrix));
		
		
		System.out.print("Negative numbers: ");
		for (byte i=0; i<matrix.length; i++) {
			for (byte j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					negativeCounter++;
					System.out.print(matrix[i][j] + " ");
				} 
				counter++;
			}
		}
		
		
		System.out.print("\nDiagonal numbers: ");
		for (byte i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		
		System.out.printf("\nTotal of number(s) in the matrix is %d.%n", counter);
		if (negativeCounter == 0) {
			System.out.println("There's no negative numbers in the matrix.");
		} else {
			System.out.printf("Total of negative number(s) in the matrix is %d.", negativeCounter);
		}
	}
}
