package sect19.ex02.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("\nHow many students for course A? ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Type the student " + i + "# code: ");
			int code = scan.nextInt();
			courseA.add(code);
		}
		System.out.print("\nHow many students for course B? ");
		n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Type the student " + i + "# code: ");
			int code = scan.nextInt();
			courseB.add(code);
		}
		System.out.print("\nHow many students for course C? ");
		n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Type the student " + i + "# code: ");
			int code = scan.nextInt();
			courseC.add(code);
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.println("\nTotal students: " + total.size());
		
		scan.close();
	}
}
