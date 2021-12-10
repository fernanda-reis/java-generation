/*
	 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.
*/
package br.com.generation.lista_lacos_de_decisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		read.close();
		
		int numero;
		double resultado;
		
		System.out.println("Digite um número: ");
		numero = read.nextInt();

		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
			System.out.println("Número par. \nRaiz quadrada de " + numero + " = " + resultado);
		} else {
			resultado = Math.pow(numero, 2);
			System.out.println("Número ímpar. \n" + numero + "² = " + resultado);
		}
	}

}
