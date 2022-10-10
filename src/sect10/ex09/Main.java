// ***************** Problema "mais velho" ***************** \\

package sect10.ex09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pessoas a serem inseridas: ");
		byte qtt = scanner.nextByte();
		byte older = 0;
		String olderName = null;
		
		String[] name = new String[qtt];
		byte[] age = new byte[qtt];
		
		for (byte i=0; i<name.length; i++) {
			scanner.nextLine();
			System.out.println("\nInsira o nome da " + (i+1) + "a pessoa: ");
			name[i] = scanner.nextLine();
			System.out.println("Insira a idade da " + (i+1) + "a pessoa: ");
			age[i] = scanner.nextByte();
			if (age[i] > older) { 
				older = age[i]; 
				olderName = name[i]; 
			}
		}
		System.out.println("Pessoa mais velha da lista: " + olderName);

		
		scanner.close();
	}
}
