package br.com.generation.heranca_polimorfismo.ex02;

public class Cavalo extends Animal {
	
	public Cavalo(String n, int i) {
		super(n, i);
	}
	
	public String emiteSom() {
		return "Relincho";
	}
	
	public String corre() {
		return (super.getNome() + " correndo...");
	}
}
