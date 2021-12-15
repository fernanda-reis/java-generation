package br.com.generation.heranca_polimorfismo.ex01;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("Bob", 2);
		System.out.println("Nome do c�o: " + cao.getNome());
		System.out.println("Idade do c�o: " + cao.getIdade());
		System.out.println("Som do c�o: "+ cao.emiteSom("Latido"));
		System.out.println("A��o do c�o: " + cao.corre());
		System.out.println();
		Cavalo cav = new Cavalo("Pocot�", 5);
		System.out.println("Nome do cavalo: " + cav.getNome());
		System.out.println("Idade do cavalo: " + cav.getIdade());
		System.out.println("Som do cavalo: "+ cav.emiteSom("Relincho"));
		System.out.println("A��o do cavalo: " + cav.corre());
		System.out.println();
		Pregui�a p = new Pregui�a("Kimi", 6);
		System.out.println("Nome da pregui�a: " + p.getNome());
		System.out.println("Idade do pregui�a: " + p.getIdade());
		System.out.println("Som do pregui�a: "+ p.emiteSom("zzZzZzz"));
		System.out.println("A��o da pregui�a: " + p.sobeEmArvore());
		

	}

}
