/*
 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
*/

package br.com.generation.array;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double[] pontos = new double[5];
		double maiorPonto = 0;
		
		for(int i = 0; i < pontos.length; i++) {
			System.out.println("Digite a " + (i+1) + "� pontua��o: ");
			pontos[i] = read.nextDouble();
			
			if(pontos[i] > maiorPonto) {
				maiorPonto = pontos[i];
			}
			
		}
		
		read.close();
		
		System.out.println("A maior pontua��o �: " + maiorPonto);

	}

}
