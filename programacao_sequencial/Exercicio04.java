/*
	4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
	D = (R + S) / 2, onde R = (A + B)� e S = (B + C)�  

*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite C: ");
		c = leia.nextDouble();
		
		leia.close();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r + s);
		
		System.out.println("O resultado de D � " + d);
	}

}
