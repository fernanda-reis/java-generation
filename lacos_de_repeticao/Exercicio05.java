/*
 * 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/

package br.com.generation.lacos_de_repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("(Para sair digite 0)");
		do {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			soma += numero;
		}
		
		while(numero != 0);

		read.close();
		System.out.println("Resultado da soma: " + soma );
	}

}
