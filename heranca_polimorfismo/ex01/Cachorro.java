package br.com.generation.heranca_polimorfismo.ex01;

public class Cachorro extends Animal{
	
	public Cachorro(String n, int i) {
		super(n, i);
	}

	public String corre() {
		return (super.getNome() + " correndo...");
	}

}
