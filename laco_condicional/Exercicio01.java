/*
	1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de 
	S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a 
	um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, 
	gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
	Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.println("O peso excedido � " + E + "kg e o valor da multa a ser paga � R$" + M);
		} else {
			E = 0.0;
			M = 0.0;
			System.out.println("O peso excedido � " + E + "kg e o valor da multa a ser paga � R$" + M);
		}

	}

}
