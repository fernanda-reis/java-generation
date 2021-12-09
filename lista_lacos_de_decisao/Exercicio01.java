/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package br.com.generation.lista_lacos_de_decisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = read.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = read.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = read.nextInt();
		
		read.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é " + num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior número é " + num3);
		}
		else {
			System.out.println("Resultado inconclusivo.");
		}

	}

}
