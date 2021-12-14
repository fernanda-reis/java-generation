package br.com.generation.poo.ex01;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Nome: ");
		cliente1.setNome(read.nextLine()); 
		
		System.out.println("Idade: ");
		cliente1.setIdade(read.nextInt());
		
		System.out.println("Telefone: ");
		cliente1.setTelefone(read.nextInt());
		
		read.close();
		
		System.out.println("Dados do cliente:");
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		System.out.println("Telefone: " + cliente1.getTelefone());


	}

}
