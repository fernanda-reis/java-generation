/*
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

package br.com.generation.array;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int[] dado = new int[10];
		int soma = 0, maiorPonto = 0, ocorrencias = 0;
		double media;
		
		for(int i = 0; i < dado.length; i++) {
			dado[i] = (int) (Math.random() * 6) + 1;
			System.out.print(dado[i] + " | ");
			
			soma += dado[i];
			
			if(dado[i] > maiorPonto) {
				maiorPonto = dado[i];
			}
		}
		
		media = (double) soma/dado.length;
		
		for(int i = 0; i < dado.length; i++) {
			if (dado[i] == maiorPonto) {
				ocorrencias++;
			}
		}
		
		System.out.println("\nMédia aritmética dos lançamentos: " + media);
		System.out.println("Maior pontuação: " + maiorPonto);
		System.out.println("Qtde de ocorrências: " + ocorrencias);

	}

}
