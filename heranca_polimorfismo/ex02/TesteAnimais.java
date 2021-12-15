package br.com.generation.heranca_polimorfismo.ex02;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("Bob", 2);
		System.out.println("Nome do cão: " + cao.getNome());
		System.out.println("Idade do cão: " + cao.getIdade());
		System.out.println("Som do cão: "+ cao.emiteSom());
		System.out.println("Ação do cão: " + cao.corre());
		System.out.println();
		Cavalo cav = new Cavalo("Pocotó", 5);
		System.out.println("Nome do cavalo: " + cav.getNome());
		System.out.println("Idade do cavalo: " + cav.getIdade());
		System.out.println("Som do cavalo: "+ cav.emiteSom());
		System.out.println("Ação do cavalo: " + cav.corre());
		System.out.println();
		Preguiça p = new Preguiça("Kimi", 6);
		System.out.println("Nome da preguiça: " + p.getNome());
		System.out.println("Idade do preguiça: " + p.getIdade());
		System.out.println("Som do preguiça: "+ p.emiteSom());
		System.out.println("Ação da preguiça: " + p.sobeEmArvore());
		

	}

}
