/*
	6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade; 

		System.out.println("Digite a idade: ");
		idade = read.nextInt();
		read.close();
		
		if(idade >= 5 && idade <= 7){
			System.out.println("INFANTIL A");
		}
		else if(idade >= 8 && idade <= 11){
			System.out.println("INFANTIL B");
		}
		else if(idade >= 12 && idade <= 13){
			System.out.println("JUVENIL A");
		}
		else if(idade >= 14 && idade <= 17){
			System.out.println("JUVENIL B");
		}
		else if(idade >= 18){
			System.out.println("ADULTO");
		}
		else{
			System.out.println("Idade não classificada");
		}

	}

}
