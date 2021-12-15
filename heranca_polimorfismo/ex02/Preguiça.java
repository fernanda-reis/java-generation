package br.com.generation.heranca_polimorfismo.ex02;

public class Pregui�a extends Animal {

	public Pregui�a(String n, int i) {
		super(n, i);
	}

	public String emiteSom() {
		return "zzZzzZzzZz";
	}
	
	public String sobeEmArvore() {
		return (super.getNome() + " subindo em uma �rvore...");
	}
}
