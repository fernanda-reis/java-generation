/*
 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
*/
package br.com.generation.lacos_de_repeticao;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero, pares = 0, impares = 0;
		
		for(int i = 0; i < 10; i++) {
			numero = (int) (Math.random()*11);
			if (numero % 2 == 0) {
				pares++;
			} else impares++;
		}
		
		System.out.println(pares + " n�meros pares e " + impares + " n�meros �mpares.");

	}

}
