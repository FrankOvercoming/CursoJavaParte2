package aplicacoes;

import java.util.TreeMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map estrutura de dados generica com chave e valor
		// a chave pode ser qualquer tipo de objeto e o valor tambem
		// sendo que tem 3 tipos de implementações assim como no Set
		// HashMap, TreeMap e LinkedHashMap, trabalha de forma analoga, isto é,
		// HashMap usa Hashcode, TreeMap usa interface Comparable então tem que implementar
		// se a classe for criada e não pertencer ao java
		// Lembrando que TreeMap usa equals, comparable e ordena pela chave
		// Regra para Map
		// Regra para chave valor
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@uol.com.br");
		cookies.put("telefone", "011998988989");
		
		// cookies.keySet() retorna um Set com as chaves contidas no Map
		// Não aceita chaves duplicadas então se eu incluir uma chave igual ele
		// troca o valor não adiciona 2 chaves iguais
		// Regra para keyset
		// Regra para Map
		
		
		cookies.remove("email");
		
		cookies.put("username", "Joao");
		
		System.out.println("Contem telefone ? - " + cookies.containsKey("telefone"));
		// o containsKey verifica se tem a chave informada, lembrando que se a chave
		// for um objeto criado é preciso implementar o equals senão não tem como achar
		// se no maps tem o objeto informado pois ele usa o equals
		// Regra para equals
		// Regra para containsKey
		// Regra para Map
		
		System.out.println(cookies);
		for(String valor : cookies.keySet()) {
			System.out.println("chave: " + valor + " conteudo: " + cookies.get(valor) );
		}
		// Sempre quando precisar fazer o "for" interativo usar o generics que foi definido para
		// o collections no caso foi definido String então usar no "for"
		// Regra para Collections
		// Regra para Maps
		// Regra para For interativo
		
		System.out.println("Verificando size do maps: " + cookies.size());
		
	}

}
