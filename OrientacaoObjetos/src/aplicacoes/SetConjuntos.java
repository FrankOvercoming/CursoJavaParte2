package aplicacoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set trata de conjuntos
		// tem 3 tipos 1- HashSet, 2-TreeSet, 3-LinkedHashSet
		// 1-mais rapido, 2-mais lento, 3-intermediario
		// Regra para Set
		// Regra para Conjuntos
		
		
		Set<String> set = new HashSet<String>();
		// Hashset é o mais rapido mas não garante ordem dos itens
		// nem ordem alfabética nem ordem de inserção, totalmente sem ordem
		
		testaSet(set);
		
		System.out.println("Verifica se existe elemento \"Tablet\" no set: " + set.contains("Tablet"));
		// Caracter de escape para aspas duplas \"
		// Regra para aspas
		// Regra para caracter escape
		
		Set<String> set2 = new TreeSet<String>();
		// Ordena os itens as letras maiusculas vem primeiro por isso pode parecer estar
		// fora de ordem alfabética
		
		testaSet(set2);
		// Exibição vem pela ordem de inserção no conjunto
		
		Set<String> set3 = new LinkedHashSet<String>();
		
		testaSet(set3);
		
		
	}
	public static void testaSet(Set<String> conjunto) {
		System.out.println();
		System.out.println("Tipo de conjunto: " + conjunto.getClass().getSimpleName());

		conjunto.add("TV");
		conjunto.add("Tablet");
		conjunto.add("Notebook");
		conjunto.add("Radio");
		conjunto.add("Celular");
		
		System.out.println("Saida toString do conjunto: " + conjunto);
		System.out.println("Ordem original da lista TV,Tablet,Notebook");
		
		System.out.println("Varredura conteudo conjunto set: ");
		for(String item : conjunto) {
			System.out.println(item);
		}
		
		
		
		conjunto.remove("Tablet");
		// Testando remove
		
		
		System.out.println("Removido Tablet: " + conjunto);
		
		conjunto.removeIf(x -> x.length() > 5);
		// Testando removeIf que usa predicado para fazer a filtragem do que será removido
		// le-se do elemento x eu vou remover se x.length() > 5
		
		System.out.println("Removidos com predicado (Notebook, Celular) : " + conjunto);
	}
	
	
}
