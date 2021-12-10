/*
	8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a 
	mesma for maior que 100, caso contrário imprimi-la com o valor zero.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int N;

		System.out.println("Digite um número: ");
		N = read.nextInt();
		read.close();
		
		if(N > 100){
			System.out.println(N);
		} else {
			N = 0;
			System.out.println(N);
		}
	}

}
