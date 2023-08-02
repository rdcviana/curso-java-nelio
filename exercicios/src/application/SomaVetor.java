package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar: ");
		int quant = sc.nextInt();
		
		double soma = 0.0;
		double[] vect = new double[quant];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.println();
		System.out.print("Valores: ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		
		System.out.printf("M�dia: %.2f%n", (soma/vect.length));
		sc.close();
		

	}

}
