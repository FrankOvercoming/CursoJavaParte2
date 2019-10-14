package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <> generics
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Joao");
		list.add(1, "Mane");
		list.add("Jose");
		list.add("Joao");
		
		// Copiando uma lista a partir de outra lista
		List<String> listaBak = new ArrayList<String>(list);
		
		
		list.remove("Joao");
		System.out.println("Tamanho da lista: " + list.size());
		imprimeLista(list);
		
		// predicado: x -> x.charAt(0) == 'J'
		// leia-se quando X que é string tiver o tipo char na posicao 0 igual a J
		// também conhecida como função lambda
		list.removeIf(x -> x.charAt(0) == 'J');
		
		System.out.println("-----------------------------------");
		
		imprimeLista(list);
		System.out.println("-----------------------------------------");
		System.out.println("Index of Joao: " + list.indexOf("Joao"));
		System.out.println("Index of Mane: " + list.indexOf("Mane") );
		System.out.println("--------------------------------------------");
	
		// Filtrando lista que contenha apenas nomes começados com J
		List<String> resultado = listaBak.stream().filter(x-> x.charAt(0) == 'J').collect(Collectors.toList());
		imprimeLista(resultado);
		
		//Encontra primeira ocorrencia da lista que comece com J
		String nome = listaBak.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(nome);
		
		
	}
	static public void imprimeLista(List<String> resultado) {
		for (String a: resultado) {
			System.out.println(a);
		}
		System.out.println("---------------------------------------------");
	}

}
