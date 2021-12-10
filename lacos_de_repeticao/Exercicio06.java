/*
 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
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
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
		}
		while(numero != 0);

		read.close();
		System.out.println("soma: " + soma + "\ncontador: " + contador);
		System.out.println("Média dos números múltiplos de 3: " + soma/contador);
	}

}
