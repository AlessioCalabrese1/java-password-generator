package org.generation.italy.security;
import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire il nome: ");
		String name = in.nextLine();
		System.out.println("\n");
		
		System.out.println("Inserire il cognome: ");
		String surname = in.nextLine();
		System.out.println("\n");
		
		System.out.println("Inserire il colore preferito: ");
		String color = in.nextLine();
		System.out.println("\n");
		
		System.out.println("Inserire la data di nascita suddivisa in giorno: ");
		int day = in.nextInt();
		System.out.println("Mese: ");
		int month = in.nextInt();
		System.out.println("Anno: ");
		int year = in.nextInt();
		System.out.println("\n");
		
		System.out.println("La tua password sarà:\n");
		System.out.println(name + '-' + surname + '-' + color + '-' + (day+month+year));
	}
}
