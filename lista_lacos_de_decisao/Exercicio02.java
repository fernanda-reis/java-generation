/*
 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
 */

package br.com.generation.lista_lacos_de_decisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = read.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = read.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		num3 = read.nextDouble();
		
		read.close();
		
		System.out.println("Ordem crescente:");
		
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println(num1 + " < " + num2 + " < "+ num3);
			}
			else if (num3 < num2) {
				System.out.println(num1 + " < " + num3 + " < " + num2);
			}
			else {
				System.out.println("Resultado inconclusivo.");
			}
		}
		else if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println(num2 + " < " + num1 + " < " + num3);
			}
			else if (num3 < num1) {
				System.out.println(num2 + " < " + num3 + " < " + num1);
			}
			else {
				System.out.println("Resultado inconclusivo.");
			}
		}
		else if (num3 < num1 && num3 < num2) {
			if (num1 < num2) {
				System.out.println(num3 + " < " + num1 + " < " + num2);
			}
			else if(num2 < num1) {
				System.out.println(num3 + " < " + num2 + " < " + num1);
			}
			else  {
				System.out.println("Resultado inconclusivo.");
			}
		}
		else {
			System.out.println("Resultado inconclusivo.");
		}
	}

}
