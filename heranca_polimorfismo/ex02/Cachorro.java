package br.com.generation.heranca_polimorfismo.ex02;

public class Cachorro extends Animal{
	
	public Cachorro(String n, int i) {
		super(n, i);
	}

	public String emiteSom() {
		return "Latido";
	}
	
	public String corre() {
		return (super.getNome() + " correndo...");
	}

}
