// ************** Problema "maior posição" ************** \\

package sect10.ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		byte numbers;
		int highestNum = 0;
		byte position = 0;
		
		System.out.println("Quantos número você quer testar? ");
		numbers = scanner.nextByte();
		
		int[] intNums = new int[numbers];
		
		for(byte i=0; i<intNums.length; i++) {
			System.out.println("Insira o " + (i+1) + "o número: ");
			intNums[i] = scanner.nextInt();
		}
		
		for(byte i=0; i<intNums.length; i++) {
			if (intNums[i] > highestNum) {
				highestNum = intNums[i];
				position = i;
			}
		}
		System.out.println("Maior valor: " + highestNum);
		System.out.println("Posição do maior valor: " + position);
		
		scanner.close();
	}
}
