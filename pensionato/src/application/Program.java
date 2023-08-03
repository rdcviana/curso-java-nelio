package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] rooms = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int quantRooms = sc.nextInt();
		
		for (int i=0; i<quantRooms; i++) {
			System.out.println("\nRent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Student(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].toString());
			}
		}
		
		sc.close();

	}

}
