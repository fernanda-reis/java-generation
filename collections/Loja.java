/*
 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
 * */

package br.com.generation.collections;

import java.util.ArrayList;

public class Loja {
	
	ArrayList<String> produtos = new ArrayList<>();
	
	public void adicionar(String p) {
		produtos.add(p);
		System.out.println(p + " adicionado ao estoque.");
	}
	
	public void remover(int p) {
		produtos.remove(p);
		System.out.println(p + " removido do estoque.");
	}
	
	public void atualizar(int p, String pr) {
		produtos.set(p, pr);
		System.out.println("Estoque atualizado.");
	}
	
	public void listar() {
		for(int i = 0; i < produtos.size(); i++) {
			System.out.println(i + " - " + produtos.get(i));
		}
	}
}
