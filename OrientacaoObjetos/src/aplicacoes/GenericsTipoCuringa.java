package aplicacoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTipoCuringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> listaDeObjetos = new ArrayList<>();
		List<Integer> listaDeInteiros = new ArrayList<>();
		
		// Da Erro porque não é um subtipo como no exemplo abaixo
		// listaDeObjetos = listaDeInteiros;
		// Regra para List
		// Regra para Curinga
		// Regra para Generics curinga
		
		// Neste caso podemos fazer upCasting mas na list não
		// não esquecer que no upcasting eu não preciso colocar entre parenteses a conversão
		// é automatica e no upcasting eu coloco o filho no pai, eu não preciso declarar o upcasting
		// somente o downcasting
		// Regra para upcasting
		// Regra para Object
		// Regra para variavel de qualquer valor
		Object obj;
		Integer i = 10;
		obj = i;
		
		List<Integer> lista = Arrays.asList(10,5,89,100,8978);
		imprimiLista(lista);
		
		// Usado sem nada para pular uma linha na saida do console
		// Regra para println
		// Regra para pular linha
		System.out.println();
		
		List<String> lista2 = Arrays.asList("maria","joao","Mane","ze","manolo");
		imprimiLista(lista2);
	}
	
	public static void imprimiLista(List<?> lista) {
		// No caso usamos o curinga ? assim podemos passar como parametro qualquer tipo de List
		// para a função
		// Regra para curinga
		// Regra para Generics curinga
		
		// lista.add(3);
		// Não posso adicionar item na lista curinga
		// Regra para curinga
		// Regra para generics curinga
		for(Object obj : lista  ) {
			System.out.println(obj);
		}
	}

}
