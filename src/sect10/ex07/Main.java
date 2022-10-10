// ************** Problema "abaixo da media" ************** \\

package sect10.ex07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		byte numbers;
		float acc = 0;
		float avg = 0;

		System.out.println("Quantos número você quer testar? ");
		numbers = scanner.nextByte();
		
		float[] array = new float[numbers];
		
		
		for(byte i=0; i<array.length; i++) {
			System.out.println("Insira o " + (i+1) + "o número do vetor: ");
			array[i] = scanner.nextFloat();
			acc += array[i];
		}		

		avg = acc / array.length;
		System.out.println("Media do vetor: \n" + String.format("%.3f", avg)); 
		System.out.println("Elementos abaixo da média: ");
		for(byte i=0; i<array.length; i++) {
			if (array[i] < avg) {
				System.out.println(array[i]);
			}
		}
		
		scanner.close();
	}
}
