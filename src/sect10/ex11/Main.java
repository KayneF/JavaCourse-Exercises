// ***************** Problema "dados pessoas" ***************** \\

package sect10.ex11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pessoas a serem inseridas: ");
		byte qtt = scanner.nextByte();
		float shorter = 5;
		float taller = 0;
		byte maleCounter = 0;
		float femaleTotalHeight = 0;
		
		String[] sex = new String[qtt];
		float[] height = new float[qtt];
		
		for (byte i=0; i<sex.length; i++) {
			System.out.printf("Altura da %d pessoa: ", (i+1));
			height[i] = scanner.nextFloat();
			System.out.printf("Sexo da %d pessoa: ", (i+1));
			scanner.nextLine();
			sex[i] = scanner.nextLine().toUpperCase();
			if (sex[i].equals("M")) { maleCounter++; }
			if (sex[i].equals("F")) { femaleTotalHeight += height[i]; }
			if (height[i] > taller) { taller = height[i]; }
			if (height[i] < shorter) { shorter = height[i]; }
		}
		
		System.out.println("Menor altura: " + String.format("%.2f", shorter));
		System.out.println("Maior altura: " + String.format("%.2f", taller));
		System.out.println("Media de altura das mulheres: "
				+ String.format("%.2f", (femaleTotalHeight / (sex.length - maleCounter))));
		System.out.println("Número de homens: " + maleCounter);

		
		scanner.close();
	}
}
