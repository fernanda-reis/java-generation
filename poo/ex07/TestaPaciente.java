package br.com.generation.poo.ex07;

import java.util.Scanner;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Paciente paciente = new Paciente();
		
		System.out.println("Nome: ");
		paciente.setNome(read.nextLine());
		
		System.out.println("Condição: ");
		paciente.setCondicao(read.nextLine());
		
		System.out.println("Idade: ");
		paciente.setIdade(read.nextInt());
		
		System.out.println("Dados do Paciente: ");
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Idade: " + paciente.getIdade());
		System.out.println("Condição: " + paciente.getCondicao());
		read.close();
	}

}
