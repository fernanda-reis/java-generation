/*
	5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos 
	de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel 
	varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas 
	a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo 
	s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem 
	ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o 
	medido e emita a notifica��o adequada aos diferentes grupos de empresas.
*/

package br.com.generation.laco_condicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double indice;

		System.out.println("Digite o �ndice de polui��o: ");
		indice = read.nextDouble();
		read.close();

		if (indice == 0.3){
			System.out.println("Ind�strias do 1� grupo dever�o suspender suas atividades.");
		} 
		else if (indice == 0.4) {
			System.out.println("Ind�strias do 1� e 2� grupo dever�o suspender suas atividades.");
		}
		else if (indice == 0.5) {
			System.out.println("Todas as ind�strias dever�o paralisar suas atividades.");	
		}
	}

}
