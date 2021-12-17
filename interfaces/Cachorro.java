package br.com.generation.interfaces;

public class Cachorro implements Animal {

	private String nome;
	private int idade;
	
	
	public Cachorro(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public void emitirSom() {
		System.out.println(this.nome + " latindo");	
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
