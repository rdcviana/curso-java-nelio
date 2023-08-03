package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int q = sc.nextInt();
		
		int[] numeros = new int[q];
		int quantPares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("NÚMEROS PARES: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				quantPares++;
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES: " + quantPares);	
		
		sc.close();

	}

}
