/*
	2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas 
	trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
	Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
	caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
	imprimir o sal�rio total e o sal�rio excedente.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double C, N, E, salario;

		System.out.println("Digite o n�mero de horas trabalhadas: ");
		N = read.nextDouble();
		System.out.println("Digite o c�digo: ");
		C = read.nextDouble();
		read.close();
		
		if (N > 50) {
			E = (N - 50) * 20;
			salario = (50 * 10) + E;
		} else {
			E = 0.0;
			salario = N * 10;
		}

		System.out.println("Categoria: " + C + "\nSal�rio total: R$" + salario + "\nSal�rio excedente: R$" + E);
	
	}

}
