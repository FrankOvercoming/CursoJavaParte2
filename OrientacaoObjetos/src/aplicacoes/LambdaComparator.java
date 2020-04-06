package aplicacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entidades.LambdaComparatorComparator;
import entidades.LambdaComparatorProduto;

public class LambdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<LambdaComparatorProduto> lista = new ArrayList<>();

		lista.add(new LambdaComparatorProduto("TV", 2567.23));
		lista.add(new LambdaComparatorProduto("Tablet", 1456.00));
		lista.add(new LambdaComparatorProduto("Notebook", 3400.00));

//		Collections.sort(lista);

		// Não precisamos mais implementar a interface comparable no
		// LambdaComparatorProduto
		// então não vamos usar Collections.sort
		lista.sort(new LambdaComparatorComparator());
		// Para usar o sort do list precisamos criar uma classe que implemente a
		// interface
		// Comparator então vamos criar a classe LambdaComparatorComparator

		System.out.println(lista);

		Comparator<LambdaComparatorProduto> comp = new Comparator<>() {

			@Override
			public int compare(LambdaComparatorProduto o1, LambdaComparatorProduto o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareToIgnoreCase(o2.getNome());
			}

		};
		// Agora fizemos da mesma forma que criando a classe num arquivo externo porem
		// criando uma classe anonima e adicionando essa classe numa variável
		// Regra para Classe Anonima
		// Regra para Comparator
		// Regra para ordenacao

		lista.sort(comp);
		
		System.out.println(lista);

		Comparator<LambdaComparatorProduto> comp2 = (p1, p2) -> {
			return p1.getNome().compareToIgnoreCase(p2.getNome());

		};
		// Agora usamos uma expressão lambda que é uma função anonima
		// então temos função com parametros p1,p2 levando a uma implementação de função
		// {} fechada por colchetes, sendo que o sistem ja sabe que é a implementação
		// da função compare
		// O compilador faz uma inferencia de tipos eu não precisei colocar
		// LambdaComparatorProduto p1 e LambdaComparatorProduto p2
		// Regra para Lambda
		// Regra para Função anonima
		// Regra para Arrow Function
		// Regra para programação funcional
		lista.sort(comp2);

		System.out.println(lista);

		Comparator<LambdaComparatorProduto> comp3 = (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome());
		// Podemos simplificar a expressão lambda para uma linha apenas pois essa função
		// não usa mais do que uma linha
		// Em programação funcional expressão lambda significa que a função anonima
		// se torna um objeto de primeira classe ou primeira ordem pois pode 
		// ser passada como argumento para outra função
		// Esta função (p1, p2) não tem nome por isso é anonima
		
		// Regra para Lambda
		// Regra para Função anonima
		// Regra para Arrow Function
		// Regra para programação funcional

		lista.sort(comp3);

		System.out.println(lista);

		lista.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
		// Podemos também colocar a expressão lambda diretamente no sort do list
		// Regra para Lambda
		// Regra para Função anonima
		// Regra para Arrow Function

		System.out.println(lista);

		lista.sort(LambdaComparator::ComparaProduto);

		System.out.println(lista);

	}

	public static int ComparaProduto(LambdaComparatorProduto p1, LambdaComparatorProduto p2) {
		return p1.getNome().compareToIgnoreCase(p2.getNome());
	}

}
