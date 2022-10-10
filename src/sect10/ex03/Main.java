// ***************** Problema "soma vetor" ***************** \\

package sect10.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pessoas a serem inseridas: ");
		byte qtt = scanner.nextByte();
		float totalHeight = 0;
		byte minorCount = 0;
		
		String[] name = new String[qtt];
		byte[] age = new byte[qtt];
		float[] height = new float[qtt];
		
		for (byte i=0; i<name.length; i++) {
			scanner.nextLine();
			System.out.println("\nInsira o nome da " + (i+1) + "a pessoa: ");
			name[i] = scanner.nextLine();
			System.out.println("Insira a idade da " + (i+1) + "a pessoa: ");
			age[i] = scanner.nextByte();
			System.out.println("Insira a altura da " + (i+1) + "a pessoa: ");
			height[i] = scanner.nextFloat();
			totalHeight = height[i];
			if (age[i] < 16) { minorCount++; }
		}
		
		System.out.println("Altura média: " + (totalHeight / name.length));
		System.out.println("Pessoas menores de 16 anos: " + ((minorCount / age.length) * 100) + "%");
		for (byte i=0; i<name.length; i++) {
			if (age[i] < 16) { 
				System.out.println(name[i]);
				minorCount++; 
			}
		}
		
		scanner.close();
	}
}
