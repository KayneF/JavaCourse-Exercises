// ***************** Problema "mais velho" ***************** \\

package sect10.ex10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pessoas a serem inseridas: ");
		byte qtt = scanner.nextByte();
		
		String[] name = new String[qtt];
		float[] nota1 = new float[qtt];
		float[] nota2 = new float[qtt];
		
		for (byte i=0; i<name.length; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do "
					+ (i+1) 
					+ "o aluno:"
					);
			scanner.nextLine();
			name[i] = scanner.nextLine();
			nota1[i] = scanner.nextFloat();
			nota2[i] = scanner.nextFloat();
		}
		
		System.out.println("Alunos aprovados: ");
		for (byte i=0; i<name.length; i++) {
			if (((nota1[i] + nota2[i]) / 2) >= 6) {
				System.out.println(name[i] + " - Média: " + String.format("%.2f", (nota1[i] + nota2[i]) / 2));
			}
		}

		
		scanner.close();
	}
}
