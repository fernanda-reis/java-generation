/*
 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
 */

package br.com.generation.lista_lacos_de_decisao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = read.nextInt();
		read.close();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulto.");
		}
		else {
			System.out.println("Categoria inválida.");
		}
	}

}
