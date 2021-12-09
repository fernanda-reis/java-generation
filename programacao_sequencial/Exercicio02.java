/*
	2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int totalDias, qtdeAnos, qtdeMeses, qtdeDias;
		
		System.out.println("Digite a idade em dias: ");
		totalDias = leia.nextInt();
		leia.close();
		
		qtdeAnos = (totalDias / 365);
		System.out.print(qtdeAnos + " anos, ");
		
		qtdeMeses = (totalDias - (qtdeAnos * 365)) / 30;
		System.out.print(qtdeMeses + " meses e ");
		
		qtdeDias = totalDias - ((qtdeAnos * 365) + (qtdeMeses * 30));
		System.out.print(qtdeDias + " dias.");
		
		
	}

}
