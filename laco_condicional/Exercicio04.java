/*
	4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número 
	é par ou ímpar, e se é positivo ou negativo.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numero;

		System.out.println("Digite o número: ");
		numero = read.nextInt();
		read.close();
		
		if (numero != 0){
			
			System.out.printf("O número " + numero + " é ");
			
			if ((numero%2) == 0){
				System.out.printf("Par e ");
			} else {
				System.out.printf("Ímpar e ");
			}
	
			if (numero > 0){
				System.out.printf("Positivo");
			} else {
				System.out.printf("Negativo");
			}
		} else {
			System.out.printf("O número é 0");
		}
	}

}
