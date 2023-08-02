package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int quant = sc.nextInt();
		
		int[] vect = new int[quant];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println();
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Negativos: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();	
	}

}

