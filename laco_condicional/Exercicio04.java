/*
	4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero 
	� par ou �mpar, e se � positivo ou negativo.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numero;

		System.out.println("Digite o n�mero: ");
		numero = read.nextInt();
		read.close();
		
		if (numero != 0){
			
			System.out.printf("O n�mero " + numero + " � ");
			
			if ((numero%2) == 0){
				System.out.printf("Par e ");
			} else {
				System.out.printf("�mpar e ");
			}
	
			if (numero > 0){
				System.out.printf("Positivo");
			} else {
				System.out.printf("Negativo");
			}
		} else {
			System.out.printf("O n�mero � 0");
		}
	}

}
