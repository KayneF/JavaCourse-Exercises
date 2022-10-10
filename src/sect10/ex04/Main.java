// ************** Problema "numeros pares" ************** \\

package sect10.ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		byte numbers;
		byte odds = 0;
		
		System.out.println("Quantos número você quer testar? ");
		numbers = scanner.nextByte();
		
		int[] intNums = new int[numbers];
		
		for(byte i=0; i<intNums.length; i++) {
			System.out.println("Insira o " + (i+1) + "o número: ");
			intNums[i] = scanner.nextInt();
		}
		
		System.out.println("\nNúmeros pares: ");
		for(byte i=0; i<intNums.length; i++) {
			if ((intNums[i] % 2) == 0) {
				System.out.print(intNums[i] + "  ");
				odds++;
			}
		}
		System.out.println("\nQuantidade de pares: " + odds);
		
		scanner.close();
	}
}
