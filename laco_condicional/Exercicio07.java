/*
	7) Receber valores de base e altura de um tri�ngulo e verificar se s�o 
	valores v�lidos (positivos maiores que zero). Em caso afirmativo, 
	calcular a �rea do tri�ngulo.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int base, altura, area;

		System.out.println("Digite a base do tri�ngulo: ");
		base = read.nextInt();

		System.out.println("Digite a altura do tri�ngulo: ");
		altura = read.nextInt();
		read.close();
		
		if(base > 0 && altura > 0){
			area = (base*altura)/2;
			System.out.println("A �rea do tri�ngulo � "+ area);
		}
		else{
			System.out.println("Valores inv�lidos");
		}
	}

}
