/*
	6. Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, 
	P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	d = raize de (x2 - x1)² + (y2 - y1)²
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, y1, x2, y2, p1, p2, d;
		
		System.out.println("Digite x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite y2: ");
		y2 = leia.nextDouble();
		
		leia.close();
		
		p1 = Math.pow((x2-x1), 2);
		p2 = Math.pow((y2-y1), 2);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância entre os pontos é: " + d);
		
		
	}

}
