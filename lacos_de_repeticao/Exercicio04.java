/*
 * 4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o n�mero de pessoas calmas;
 o n�mero de mulheres nervosas;
 o n�mero de homens agressivos;
 o n�mero de outros calmos;
 o n�mero de pessoas nervosas com mais de 40 anos;
 o n�mero de pessoas calmas com menos de 18 anos.
*/

package br.com.generation.lacos_de_repeticao;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, 
				outrosCalmos = 0, nervososComMaisDe40 = 0, calmosComMenosDe18 = 0;
		
		int idade, 
			sexo, 	//(1-feminino / 2-masculino / 3-Outros
			perfil; //(1-calma / 2-nervosa / 3-agressiva)
		
		int cont = 0;
		
		while(cont < 150) {
			
			idade = (int) (Math.random()*100) + 1;		
			sexo = (int) ((Math.random()*3) + 1);		
			perfil = (int) ((Math.random()*3) + 1);
			
			
			if(perfil == 1) { 
				pessoasCalmas++;
			}
			
			if(sexo == 1 && perfil == 2) {
				mulheresNervosas++;
			}
			
			if(sexo == 2 && perfil == 3) {
				homensAgressivos++;
			}
			
			if(sexo == 3 && perfil == 1) {
				outrosCalmos++;
			}
			
			if(idade > 40 && perfil == 2) {
				nervososComMaisDe40++;
			}
			
			if(idade < 18 && perfil == 1) {
				calmosComMenosDe18++;
			}
			
			cont++;
		}
		
		System.out.println("N�mero de pessoas calmas: " + pessoasCalmas +
							"\nN�mero de mulheres nervosas: " + mulheresNervosas +
							"\nN�mero de homens agressivos: " + homensAgressivos +
							"\nN�mero de outros calmos: " + outrosCalmos +
							"\nN�mero de pessoas nervosas com mais de 40 anos: " + nervososComMaisDe40 +
							"\nN�mero de pessoas calmas com menos de 18 anos: " + calmosComMenosDe18);

	}

}
