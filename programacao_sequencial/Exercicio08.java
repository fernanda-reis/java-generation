/*
	8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
	Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%, 
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/

package br.com.generation.programacao_sequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoDistribuidor, custoConsumidor;
		
		System.out.println("Digite o custo de fabrica do carro: ");
		custoFabrica = leia.nextDouble();
		leia.close();
		
		custoDistribuidor = custoFabrica + (custoFabrica * 0.28);
		custoConsumidor = custoDistribuidor + (custoDistribuidor * 0.45);
		
		System.out.println("O custo ao consumidor é de R$" + custoConsumidor + ".");
	}

}
