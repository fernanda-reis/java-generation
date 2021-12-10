/*
	7) Receber valores de base e altura de um triângulo e verificar se são 
	valores válidos (positivos maiores que zero). Em caso afirmativo, 
	calcular a área do triângulo.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int base, altura, area;

		System.out.println("Digite a base do triângulo: ");
		base = read.nextInt();

		System.out.println("Digite a altura do triângulo: ");
		altura = read.nextInt();
		read.close();
		
		if(base > 0 && altura > 0){
			area = (base*altura)/2;
			System.out.println("A área do triângulo é "+ area);
		}
		else{
			System.out.println("Valores inválidos");
		}
	}

}
