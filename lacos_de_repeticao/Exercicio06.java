/*
 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/

package br.com.generation.lacos_de_repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int contador = 0, numero, soma = 0;
		
		System.out.println("(Para sair digite 0)");
		do {
			System.out.println("Digite um n�mero: ");
			numero = read.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
		}
		while(numero != 0);

		read.close();
		System.out.println("soma: " + soma + "\ncontador: " + contador);
		System.out.println("M�dia dos n�meros m�ltiplos de 3: " + soma/contador);
	}

}
