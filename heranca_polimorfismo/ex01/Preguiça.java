package br.com.generation.heranca_polimorfismo.ex01;

public class Preguiça extends Animal {

	public Preguiça(String n, int i) {
		super(n, i);
	}

	public String sobeEmArvore() {
		return (super.getNome() + " subindo em uma árvore...");
	}
}
