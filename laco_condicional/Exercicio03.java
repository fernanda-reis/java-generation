/*
	3) Desenvolva um sistema em que:
	Leia 4 (quatro) n�meros;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.

*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double n1, n2, n3, n4, n1q, n2q, n3q, n4q;

		System.out.println("Digite o primeiro n�mero: ");
		n1 = read.nextDouble();
		n1q = Math.pow(n1, 2.0);
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = read.nextDouble();
		n2q = Math.pow(n2, 2.0);
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = read.nextDouble();
		n3q = Math.pow(n3, 2.0);
		
		System.out.println("Digite o quarto n�mero: ");
		n4 = read.nextDouble();
		n4q = Math.pow(n4, 2.0);

		read.close();
		
		if (n3q >= 1000){
			System.out.println("Quadrado do terceiro n�mero: " + n3q);
		} else {
			System.out.println(	n1 + " -> " + n1q +
					"\n" + n2 + " -> " + n2q + 
					"\n" + n3 + " -> " + n3q + 
					"\n" + n4 + " -> " + n4q);
		}

	}

}
