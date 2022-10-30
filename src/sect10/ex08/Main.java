// ************** Problema "media pares" ************** \\

package sect10.ex08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		byte numbers;
		byte evenCount = 0;
		int acc = 0;
		int avg = 0;

		System.out.println("Quantos número você quer testar? ");
		numbers = scanner.nextByte();
		
		byte[] array = new byte[numbers];
		
		for(byte i=0; i<array.length; i++) {
			System.out.println("Insira o " + (i+1) + "o número do vetor: ");
			array[i] = scanner.nextByte();
			if ((array[i] % 2) == 0) {
				evenCount++;
				acc += array[i];
			}
		}
		
		if (evenCount == 0) {
			System.out.println("Nenhum número par foi informado.");
		} else {
			avg = acc / evenCount;
			System.out.println("Média dos pares informados: " + avg);
		}
		
		
		scanner.close();
	}
}
