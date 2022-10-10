// ************** Problema "soma vetores" ************** \\

package sect10.ex06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		byte numbers;

		System.out.println("Quantos número você quer testar? ");
		numbers = scanner.nextByte();
		
		int[] array1 = new int[numbers];
		int[] array2 = new int[numbers];
		int[] arraySoma = new int[numbers];
		
		
		for(byte i=0; i<array1.length; i++) {
			System.out.println("Insira o " + (i+1) + "o número do vetor A: ");
			array1[i] = scanner.nextInt();
		}
		for(byte i=0; i<array2.length; i++) {
			System.out.println("Insira o " + (i+1) + "o número do vetor B: ");
			array2[i] = scanner.nextInt();
		}
		
		
		System.out.println("Vetor A: ");
		for(byte i=0; i<array1.length; i++) {
			System.out.print(array1[i] + "  ");
		}
		System.out.println("\nVetor B: ");
		for(byte i=0; i<array2.length; i++) {
			System.out.print(array2[i] + "  ");
			arraySoma[i] = array1[i] + array2[i];
		}
		
		
		System.out.println("\nResultado da soma das posições dos vetores: ");
		for(byte i=0; i<arraySoma.length; i++) {
			System.out.print(arraySoma[i] + "  ");
		}
		
		scanner.close();
	}
}
