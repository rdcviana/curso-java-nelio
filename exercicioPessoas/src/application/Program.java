package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int quant = sc.nextInt();
		double somaAltura = 0;
		double quantPessoasMenor = 0;
		
		Pessoa[] pessoa = new Pessoa[quant];
		
		for (int i=0; i<pessoa.length; i++) {
			System.out.println();
			System.out.println("Dados da " + (i+1) + "° pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();
			
			if (idade < 16) {
				quantPessoasMenor++;
			}
			
			somaAltura += altura;
			pessoa[i] = new Pessoa(nome, idade, altura);
			
		}
		System.out.println();
		System.out.printf("Altura média: %.2f%n", (somaAltura/pessoa.length));
		double porcentagemPessoasmenores = (quantPessoasMenor/pessoa.length)*100;
		System.out.printf("Pessoas com menos de 16: %.1f%%\n", porcentagemPessoasmenores);
		
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		
		
		sc.close();

	}

}
