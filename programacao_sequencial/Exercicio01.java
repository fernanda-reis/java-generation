/*
	1.Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int qtdeAnos, qtdeMeses, qtdeDias, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de anos: ");
		qtdeAnos = leia.nextInt();
		
		System.out.println("Digite a quantidade de meses: ");
		qtdeMeses = leia.nextInt();
		
		System.out.println("Digite a quantidade de dias: ");
		qtdeDias = leia.nextInt();
		
		leia.close();
		
		totalDias = (qtdeAnos * 365) + (qtdeMeses * 30) + qtdeDias;
		
		System.out.println("A idade em dias é " + totalDias);
		
	}

}
