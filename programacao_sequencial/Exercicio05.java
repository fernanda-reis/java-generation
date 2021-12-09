/*
	5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextInt();
		leia.close();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
				
		System.out.println("A média ponderada é " + media);
	}

}
