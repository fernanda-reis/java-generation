/*
	 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.
*/
package br.com.generation.lista_lacos_de_decisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		read.close();
		
		int numero;
		double resultado;
		
		System.out.println("Digite um n�mero: ");
		numero = read.nextInt();

		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
			System.out.println("N�mero par. \nRaiz quadrada de " + numero + " = " + resultado);
		} else {
			resultado = Math.pow(numero, 2);
			System.out.println("N�mero �mpar. \n" + numero + "� = " + resultado);
		}
	}

}
