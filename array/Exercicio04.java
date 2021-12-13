/*
 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/

package br.com.generation.array;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonalPrincipal = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite valor [%d][%d]: ", l, c, "\n");
				matriz[l][c] = read.nextInt();
				
				if(l == c) {
					somaDiagonalPrincipal += matriz[l][c];
				}
				
				soma += matriz[l][c];
			}
			
			System.out.println();
		}
		
		read.close();
		
		//exibindo resultados
		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("Soma total: " + soma);
		System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

	}

}
