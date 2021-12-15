package br.com.generation.heranca_polimorfismo.ex01;

public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String n, int i) {
		nome = n;
		idade = i;
	}
	
	public String emiteSom(String som) {
		return som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
