package br.com.generation.interfaces;

public class Pregui�a implements Animal {

	private String nome;
	private int idade;
	
	
	public Pregui�a(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public void emitirSom() {
		System.out.println(this.nome + " ZzzZzZ");
		
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
