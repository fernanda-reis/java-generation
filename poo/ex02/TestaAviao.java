package br.com.generation.poo.ex02;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		
		System.out.println("Modelo: ");
		aviao1.setModelo(read.nextLine());
		
		System.out.println("Marca: ");
		aviao1.setMarca(read.nextLine());
		
		System.out.println("Ano de Fabricação: ");
		aviao1.setAnoFabricacao(read.nextInt());
		
		System.out.println("Classe: ");
		aviao1.setClasse(read.next());
		
		read.close();
		
		System.out.println("Dados do Avião: ");
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Marca: " + aviao1.getMarca());
		System.out.println("Ano de Fabricação: " + aviao1.getAnoFabricacao());
		System.out.println("Classe: " + aviao1.getClasse());

	}

}
