// ***************** Problema "soma vetor" ***************** \\

package sect10.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double accumulator = 0;
		double average = 0;
		
		System.out.println("Digite a quantidade de números: ");
		int n = scanner.nextInt();
		
		double[] numbers = new double[n]; 
		for (int i=0; i<numbers.length; i++) {
			System.out.println("Digite o " + (i+1) + "o número: ");
			numbers[i] = scanner.nextInt();
			accumulator += numbers[i];
		}
		
		average = accumulator / numbers.length;
		System.out.println("Valores digitados: " + Arrays.toString(numbers));
		System.out.println("Soma do array: " + accumulator);
		System.out.println("Media do array: " + average);
		
		scanner.close();
	}
}
