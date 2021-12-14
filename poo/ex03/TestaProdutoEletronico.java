package br.com.generation.poo.ex03;

import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		System.out.println("Nome: ");
		produto.setNome(read.nextLine());
		
		System.out.println("Marca: ");
		produto.setMarca(read.nextLine());
		
		System.out.println("Preço: ");
		produto.setPreco(read.nextDouble());
		
		read.close();
		
		System.out.println("Dados do produto:");
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Marca: " + produto.getMarca());
		System.out.println("Preço: " + produto.getPreco());

	}

}
