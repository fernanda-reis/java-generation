/*
	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
	em segundos e mostre-o expresso em horas, minutos e segundos. 
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int totalSegundos, qtdeHoras, qtdeMinutos, qtdeSegundos;
		
		System.out.println("Digite o tempo em segundos: ");
		totalSegundos = leia.nextInt();
		leia.close();
		
		qtdeHoras = (totalSegundos / 3600);
		System.out.print(qtdeHoras + " horas, ");
		
		qtdeMinutos = (totalSegundos - (qtdeHoras * 3600)) / 60;
		System.out.print(qtdeMinutos + " minutos e ");
		
		qtdeSegundos = totalSegundos - ((qtdeHoras * 3600) + (qtdeMinutos * 60));
		System.out.println(qtdeSegundos + " segundos.");
		
	}

}
