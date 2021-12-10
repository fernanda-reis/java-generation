/*
	2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
	trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
	caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
	imprimir o salário total e o salário excedente.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double C, N, E, salario;

		System.out.println("Digite o número de horas trabalhadas: ");
		N = read.nextDouble();
		System.out.println("Digite o código: ");
		C = read.nextDouble();
		read.close();
		
		if (N > 50) {
			E = (N - 50) * 20;
			salario = (50 * 10) + E;
		} else {
			E = 0.0;
			salario = N * 10;
		}

		System.out.println("Categoria: " + C + "\nSalário total: R$" + salario + "\nSalário excedente: R$" + E);
	
	}

}
