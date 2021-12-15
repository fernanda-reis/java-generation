package br.com.generation.heranca_polimorfismo.ex02;

public class Preguiça extends Animal {

	public Preguiça(String n, int i) {
		super(n, i);
	}

	public String emiteSom() {
		return "zzZzzZzzZz";
	}
	
	public String sobeEmArvore() {
		return (super.getNome() + " subindo em uma árvore...");
	}
}
