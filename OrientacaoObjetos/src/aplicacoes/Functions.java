package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entidades.FunctionProduto;
import entidades.FunctionProdutoInterface;
import entidades.FunctionProdutoInterface2Teste;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FunctionProduto> lista = new ArrayList<>();
		lista.add(new FunctionProduto("TV", 878.00));
		lista.add(new FunctionProduto("Notebook", 1850.23));
		lista.add(new FunctionProduto("Geladeira", 1230.10));
		lista.add(new FunctionProduto("Forno Microondas", 478.00));
		
		List<String> nomes = lista.stream().map(new FunctionProdutoInterface())
				.collect(Collectors.toList());
		// Função map aplica uma função a cada elemento da stream gerando de volta
		// uma nova stream com elementos transformados
		// Para transformar a stream em uma list novamente utilizamos o collect
		// e depois o Collectors.toList()
		// Função map funciona apenas para stream
		// Regra para function
		// Regra para map
		// Regra para stream
		// Regra para list

		
		System.out.println(nomes);
		
		
		List<FunctionProduto> lista2Teste = lista.stream().map(new FunctionProdutoInterface2Teste())
				.collect(Collectors.toList());
		// Aqui eu criei um teste testando se a function também pode retornar um objeto
		// para depois eu criar uma lista com os próprios objetos modificados
		// funcionou
		// Regra para function
		// Regra para map
		// Regra para stream
		// Regra para list
		
		
		lista2Teste.forEach(System.out::println);
	
		
		List<String> lista3 = lista.stream().map(FunctionProduto::toUpperCase)
				.collect(Collectors.toList());
		// Aqui fizemos através de uma função estatica sendo chamada pelo reference method
		// lambda
		// Regra para function
		// Regra para map
		// Regra para stream
		// Regra para list
		
		System.out.println(lista3);
		
		List<String> lista4 = lista.stream().map(FunctionProduto::toUpperCaseNoStatic)
								.collect(Collectors.toList());
		//Aqui foi usando um metodo não estatico também sendo chamado pelo reference method
		// lambda
		
		System.out.println(lista4);
		
		Function<FunctionProduto , String> saida = (p) -> p.getNome().toUpperCase();
		// Aqui usamos uma expressão lambda declarada
		// Regra para function
		// Regra para map
		// Regra para stream
		// Regra para list
		
		System.out.println(lista.stream().map(saida ).collect(Collectors.toList()));

		
		List<String> lista5 = lista.stream().map(p -> p.getNome().toUpperCase() )
								.collect(Collectors.toList());
		// Aqui usamosa uma expressao lambda inline e também para saida usamos
		// um forEach
		// Regra para function
		// Regra para map
		// Regra para stream
		// Regra para list

		
		lista5.forEach(System.out::println);
		
		
	}

}
