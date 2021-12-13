/*
 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
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
		
		System.out.println("\nM�dia aritm�tica dos lan�amentos: " + media);
		System.out.println("Maior pontua��o: " + maiorPonto);
		System.out.println("Qtde de ocorr�ncias: " + ocorrencias);

	}

}
