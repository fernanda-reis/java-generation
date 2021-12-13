/*
 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/

package br.com.generation.array;

public class Exercicio03 {

	public static void main(String[] args) {
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		
		
		System.out.println("N1:\n");
		for(int l = 0; l < N1.length; l++) {
			for(int c = 0; c < N1[l].length; c++){
				N1[l][c] = (int) (Math.random() * 101);
				
				System.out.print(N1[l][c] + " | ");
			}
			System.out.println();
		}
		
		
		System.out.println("\nN2:\n");
		for(int l = 0; l < N2.length; l++) {
			for(int c = 0; c < N2[l].length; c++) {
				N2[l][c] = (int) (Math.random()*101);
				
				System.out.print(N2[l][c] + " | ");
			}
			System.out.println();
		}
		
		
		int[][] M1 = new int[4][6];
		System.out.println("\nM1:\n");
		
		for(int l = 0; l < M1.length; l++) {
			for(int c = 0; c < M1[l].length; c++){
				M1[l][c] = N1[l][c] + N2[l][c];
				
				System.out.print(M1[l][c] + " | ");
			}
			System.out.println();
		}
		
		
		int[][] M2 = new int[4][6];
		System.out.println("\nM2:\n");
		
		for(int l = 0; l < M2.length; l++) {
			for(int c = 0; c < M2[l].length; c++) {
				M2[l][c] = N1[l][c] - N2[l][c];
				
				System.out.print(M2[l][c] + " | ");
			}
			System.out.println();
		}

	}

}
