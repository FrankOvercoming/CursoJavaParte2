package aplicacoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entidades.SetHashcodeEqualsProduto;

public class SetHashcodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Aqui vamos ver como precisamos implementar os metodos hashcode e equals
		// quando vamos usar conjuntos com Set, pois ele usa esses dois metodos
		// para fazer suas pesquisas
		// quando não é implementado os metodos hashcode e equals o Set usa o 
		// ponteiro em memória da criação do objeto o que geralmente não serve pra nada
		// Regra para Set
		// Regra para Hashcode
		// Regra para Equals
		// Regra para Conjuntos
		
		Set<SetHashcodeEqualsProduto> produtos = new HashSet<>();
		produtos.add(new SetHashcodeEqualsProduto("TV", 3500.00) );
		produtos.add(new SetHashcodeEqualsProduto("Tablet", 1480.00) );
		produtos.add(new SetHashcodeEqualsProduto("Notebook", 2389.12) );
		
		
		SetHashcodeEqualsProduto prod = new SetHashcodeEqualsProduto("Notebook", 2389.12);
		
		System.out.println(produtos.contains(prod));
		System.out.println(produtos);
		
		// Agora vamos testar com o TreeSet que usa a implementação da interface
		// pois ele retorna os itens do conjunto ordenados porem para isso a classe 
		// que pertence o conjunto precisa implementar a interface Comparable
		// então tivemos que implementar essa interface no objeto SetHashcodeEqualsProduto
		// Regra para TreeSet
		// Regra para Conjunto com ordenação
		// Regra para Set
		// Regra para comparable
		Set<SetHashcodeEqualsProduto> produtosOrdenados = new TreeSet<>();
		produtosOrdenados.add(new SetHashcodeEqualsProduto("TV", 3500.00) );
		produtosOrdenados.add(new SetHashcodeEqualsProduto("Tablet", 1480.00) );
		produtosOrdenados.add(new SetHashcodeEqualsProduto("Notebook", 2389.12) );
		
		
		SetHashcodeEqualsProduto prodTeste = new SetHashcodeEqualsProduto("Notebook", 2389.12);
		
		System.out.println(produtos.contains(prod));
		System.out.println(produtosOrdenados);

	}

}
