package aplicacoes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipelines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = Arrays.asList(1,4,7,11,26,55,119);
		
		Stream<Integer> str = lista.stream().map(x -> x * 10);
		// map é uma função intermediaria que retorna um stream e transforma o conteudo
		// da stream recebida, ela pega cada elemento X da lista e transforma em outro elemento
		// conforme a expressão lambda informada
		// Regra para Stream
		// Regra para map de Stream
		
		System.out.println(Arrays.toString(lista.toArray()));
		// toArray é uma função terminal ela processa a stream que até então não foi processada
		// e retorna o resultado no caso um array de objetos e nãó de Integer
		// uma vez a Stream processada não pode mais ser utilizada
		// Regra para Stream
		// Regra para funcao terminal da Stream
	
		int somaTotal = lista.stream().reduce(0, (x,y) -> x + y);
		// Fazendo aqui o somatório, usando um elemento neutro da soma que é zero
		// e somando com os demais, se fosse fazer um produtório que seria x * y então
		// teriamos que colocar 1 em vez de zero porque o elemento neutro de uma multiplicação
		// é o numero 1, pois qualquer coisa multiplicada por 1 da ela mesma e se multiplicada
		// por zero da zero
		// Regra para soma com Stream
		// Regra para multiplicação com Stream
		// Regra para Stream soma
		// Regra para Stream multiplicação
		
		
		System.out.println("Soma total: " + somaTotal);
		
		
		List<Integer> listaInt = lista.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		// Aqui criamos um pipeline maior, aplicamos um filter que filtra a stream
		// depois um map que transforma em outra stream 
		// e por fim um collect para transformar em list novamente
		// Regra para pipeline
		// Regra para Stream
		// Regra para filter Stream
		
		System.out.println(Arrays.deepToString(listaInt.toArray()));
		
	}

}
