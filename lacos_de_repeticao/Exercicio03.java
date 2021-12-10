/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/

package br.com.generation.lacos_de_repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = read.nextInt();
			
			if(idade < 21 && idade > 0) {
				menosDe21++;
			} 
			else if (idade > 50) {
				maisDe50++;
			}	
		}
		
		read.close();
		
		System.out.println(menosDe21 + " pessoas com menos de 21 anos. \n" + maisDe50 + " pessoas com mais de 50 anos.");
	}

}
