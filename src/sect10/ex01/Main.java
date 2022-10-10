// ************** Problema "negativos" ************** \\

package sect10.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantos números deseja inserir: ");
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println("Digite o " + (i+1) + "o número: ");
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		scanner.close();
	}

}
