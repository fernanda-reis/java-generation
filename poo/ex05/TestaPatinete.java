package br.com.generation.poo.ex05;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Patinete patinete = new Patinete();
		
		System.out.println("Modelo: ");
		patinete.setModelo(read.nextLine());
		
		System.out.println("Cor: ");
		patinete.setCor(read.nextLine());
		
		System.out.println("Preço: ");
		patinete.setPreco(read.nextDouble());
		
		read.close();
		
		System.out.println("Dados do Patinete: ");
		System.out.println("Modelo: " + patinete.getModelo());
		System.out.println("Cor: " + patinete.getCor());
		System.out.println("Preço: " + patinete.getPreco());

	}

}
