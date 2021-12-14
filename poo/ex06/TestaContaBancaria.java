package br.com.generation.poo.ex06;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("Nome do proprietário: ");
		conta.setNome(read.nextLine());
		
		System.out.println("Agência: ");
		conta.setAgencia(read.nextInt());
		
		System.out.println("Número: ");
		conta.setNumero(read.nextInt());
		
		read.close();
		
		System.out.println("Dados da conta bancária: ");
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número da conta: " + conta.getNumero());
		System.out.println("Proprietário: " + conta.getNome());

	}

}
