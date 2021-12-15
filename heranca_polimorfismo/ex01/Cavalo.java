package br.com.generation.heranca_polimorfismo.ex01;

public class Cavalo extends Animal {
	
	public Cavalo(String n, int i) {
		super(n, i);
	}
	
	public String corre() {
		return (super.getNome() + " correndo...");
	}
}
