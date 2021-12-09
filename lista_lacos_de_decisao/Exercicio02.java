/*
 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
 */

package br.com.generation.lista_lacos_de_decisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite três números: ");
		num1 = read.nextDouble();
		num2 = read.nextDouble();
		num3 = read.nextDouble();
		
		read.close();
		
		System.out.println("Ordem crescente:");
		
		if (num1 <= num2 && num1 <= num3) {
			if (num2 <= num3) {
				System.out.println(num1 + " - " + num2 + " - "+ num3);
			}
			else {
				System.out.println(num1 + " - " + num3 + " - " + num2);
			}
		}
		else if (num2 <= num1 && num2 <= num3) {
			if (num1 <= num3) {
				System.out.println(num2 + " - " + num1 + " - " + num3);
			}
			else {
				System.out.println(num2 + " - " + num3 + " - " + num1);
			}
		}
		else if (num3 <= num1 && num3 <= num2) {
			if (num1 <= num2) {
				System.out.println(num3 + " - " + num1 + " - " + num2);
			}
			else {
				System.out.println(num3 + " - " + num2 + " - " + num1);
			}
		}
		else {
			System.out.println("Resultado inconclusivo.");
		}
	}

}
