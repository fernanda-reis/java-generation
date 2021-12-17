package br.com.generation.interfaces;

public class TestaAnimalInterface {

	public void emitindoSom(Animal animal) {
		animal.emitirSom();
	}
	
	public static void main(String[] args) {
		
		Animal c = new Cachorro("Bob", 3);
		c.emitirSom();
		
		Animal v = new Cavalo("Mimi", 3);
		v.emitirSom();
		
		Animal p = new Preguiça("Tonia", 3);
		p.emitirSom();

	}

}
