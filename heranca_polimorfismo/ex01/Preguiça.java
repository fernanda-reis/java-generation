package br.com.generation.heranca_polimorfismo.ex01;

public class Pregui�a extends Animal {

	public Pregui�a(String n, int i) {
		super(n, i);
	}

	public String sobeEmArvore() {
		return (super.getNome() + " subindo em uma �rvore...");
	}
}
