package br.com.generation.poo.ex04;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.setNome(read.nextLine());
		
		System.out.println("Cargo: ");
		funcionario.setCargo(read.nextLine());
		
		System.out.println("Salário: ");
		funcionario.setSalario(read.nextDouble());
		
		read.close();
		
		System.out.println("Dados do Funcionário: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Salário: " + funcionario.getSalario());

	}

}
