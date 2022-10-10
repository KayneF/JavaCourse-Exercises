package sect10.ex12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many room will be rented? ");
		byte n = scan.nextByte();
		Rent[] rent = new Rent[10];
		
		for (byte i=0; i<n; i++) {
			Rent r = new Rent();
			scan.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.println("Client name: ");
			r.setName(scan.nextLine());
			System.out.println("Client email: ");
			r.setEmail(scan.nextLine());
			System.out.println("Client room: ");
			r.setRoom(scan.nextByte());
			rent[r.getRoom()-1] = r;
		}
		
		System.out.println("Busy rooms: ");
		for(byte i=0; i<rent.length; i++) {
			if (!(rent[i] == null)) { 
				System.out.println(rent[i]);
			} else {
				System.out.println("Room " + (i+1) + ": empty");
			}
		}
		
		scan.close();
	}

}
