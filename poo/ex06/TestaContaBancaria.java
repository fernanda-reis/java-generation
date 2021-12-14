package br.com.generation.poo.ex06;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("Nome do propriet�rio: ");
		conta.setNome(read.nextLine());
		
		System.out.println("Ag�ncia: ");
		conta.setAgencia(read.nextInt());
		
		System.out.println("N�mero: ");
		conta.setNumero(read.nextInt());
		
		read.close();
		
		System.out.println("Dados da conta banc�ria: ");
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("N�mero da conta: " + conta.getNumero());
		System.out.println("Propriet�rio: " + conta.getNome());

	}

}
