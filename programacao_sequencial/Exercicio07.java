/*
	7. Um sistema de equações lineares do tipo: ax + by = c, dx + ey = f, 
	pode ser resolvido segundo mostrado abaixo :
	x = (ce - bf) / (ae - bd)
	y = (af - cd) / (ae - bd)
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.  
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, E, F, X, Y;
	
		System.out.println("Digite A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite B: ");
		B = leia.nextDouble();
		
		System.out.println("Digite C: ");
		C = leia.nextDouble();
		
		System.out.println("Digite D: ");
		D = leia.nextDouble();
		
		System.out.println("Digite E: ");
		E = leia.nextDouble();
		
		System.out.println("Digite F: ");
		F = leia.nextDouble();
		
		leia.close();
		
		X = ((C*E) - (B*F)) / ((A*E) - (B*D));
		Y = ((A*F) - (C*D)) / ((A*E) - (B*D));
		
		System.out.println("O valor de x é " + X + " e o valor de y é " + Y + ".");
	}

}
