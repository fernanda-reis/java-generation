package br.com.generation.collections;

public class Principal {

	public static void main(String[] args) {
		
		Loja loja = new Loja();
		
		loja.adicionar("Blusa");
		loja.adicionar("Calça");
		loja.adicionar("Sapato");
		loja.adicionar("Casaco");
		
		loja.listar();
		
		loja.atualizar(2, "Botas");
		
		loja.listar();
		
		loja.remover(3);
		
		loja.listar();
	}

}
