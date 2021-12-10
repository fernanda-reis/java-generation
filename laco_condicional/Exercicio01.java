/*
	1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de 
	São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça 
	um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, 
	gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
	Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double P, E, M;
		
		System.out.println("Digite o peso de tomates: ");
		P = read.nextDouble();
		read.close();
		
		if (P > 50) {
			E = P - 50;
			M = 4.0 * E;
			System.out.println("O peso excedido é " + E + "kg e o valor da multa a ser paga é R$" + M);
		} else {
			E = 0.0;
			M = 0.0;
			System.out.println("O peso excedido é " + E + "kg e o valor da multa a ser paga é R$" + M);
		}

	}

}
