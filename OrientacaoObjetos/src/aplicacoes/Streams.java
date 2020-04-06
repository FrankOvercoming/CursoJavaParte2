package aplicacoes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;





public class Streams {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(12,8,5,1,89);
		
		Stream<Integer> str1 = lista.stream().map(p -> p * 10);
		
		String[] saida = new String[lista.size()];
	
		
		
		str1.forEach( p -> {
			
			int i = 0;
			while( saida[i] != null) {
				i++;
			}
			System.out.println(i);
			saida[i] = p.toString();
		});
		// Aqui fiz um teste para foreach do tipo lambda colocando fun��o dentro
		// muito interessante, n�o consigo usar uma vari�vel de fora tipo um int i e ir 
		// adicionando, ent�o fiz o while para achar a proxima posi��o livre no vetor
		// aqui eu fiz um conversor muito ruim de array
		// Regra para foreach
		// Regra para foreach lambda
	
		System.out.println(Arrays.toString(saida));
		
		Stream<Integer> strInteger = lista.stream().sorted();
		
		//strInteger = ordena(strInteger);
		
		
		System.out.println(strInteger.collect(Collectors.toList()));
		
      	Stream<String> str2 = lista.stream().sorted().filter(p -> {
       		System.out.println("passou filter");
       		return p % 2 ==0;	
       	}).map(p -> {
       		System.out.println("Passou map");
 			return String.valueOf(p);
       	});
    	// Aqui peguei uma list de Integer apliquei um filtro para
      	// ter apenas numeros pares e converti para uma Stream de String usando
    	// uma fun��o lambda declarada com return
      	// tamb�m apliquei uma ordena��o antes que os numeros virassem
    	// Regra para Stream
    	// Regra para Converter Stream
      	// Regra para Lambda return
 		// Regra para Converter Lista
      	
    	
    	
		Integer teste = 10;
		
	
		Integer[] itens =  str2.map(p -> Integer.parseInt(p)).toArray(Streams::transforma);
		// Aqui usamos uma reference method que recebe o tamanho do array
		// e retorna um array de integer para a fun��o toArray usar
		// Regra para toArray
		// Regra para Stream com reference method
		
		
		System.out.println(itens.getClass().getName());
		System.out.println(Arrays.toString(itens));
		// A fun��o toString de Arrays transforma um Array numa String
		// Regra para Array
		// Regra para Converter Array para String
		// Regra para Transformar Array em String
		
		int saida4 = lista.stream().reduce(1,(subTotal, elemento) -> subTotal + elemento);
		// Operac�o reduce de stream, esta fun��o pega o valor 0 como valor referencia
		// isto �, ser� feita uma soma usando subTotal como vari�vel a ser somada e elemento
		// o elemento de fato que est� na lista do stream, e este valor referencia ser� 
		// somado junto como se fosse o primeiro valor e se a soma der zero
		// esse valor referencia ser� retornado
		// Regra para stream
		// Regra para reduce
		// Regra para Reduce Stream
		// Regra para Stream Reduce
	
		System.out.println(saida4);
		
		
		Stream<String> strLiteral = Stream.of("Jo�o", "Maria", "Zez�o");
		// Aqui fazemos uma declara��o literal de Stream, criando uma lista dentro
		// do pr�prio c�digo
		// Regra para Stream
		// Regra para Stream Literal
		
		System.out.println(strLiteral.collect(Collectors.toSet()));
		
		Stream<String> strIterate = Stream.iterate("Oi", x -> { 
			return x + " tum";
		});
		// Aqui temos um iterate que pega o primeiro parametro e usa como referencia para
		// unir que a fun��o lambda informada no segundo parametro s� vai parar quando usar
		// o limit logo abaixo
		// Sem esquecer que esta � uma opera��o intermediaria e retorna um Stream
		// Regra para Stream
		// Regra para Stream Iterate
		// Regra para Stream sequencia sem fim
		
		String[] tums = strIterate.limit(10).toArray(String[]::new);
		// Aqui transformamos um Stream num Array, sendo que o toArray sempre retorna um
		// object ent�o temos que usar um reference method para String[] new
		// Regra para Stream
		// Regra para Converter Stream em Array
		// Regra para Stream para Array
		
		Stream<String> convTums = Arrays.stream(tums);
		// Convertendo array para Stream
		// Regra para Array
		// Regra para Stream
		// Regra para Converter Array para Stream
		// Regra para Array para Stream
		
		List<String> streamTum = convTums.collect(Collectors.toList());
		
		System.out.println(streamTum);
		
	}
	
	public static Integer[] transforma(int sizes) {
		System.out.println("Passando: " + sizes);
		Integer[] saida = new Integer[sizes];
		return saida;
	}
	
	public static Stream<Integer> ordena(Stream<Integer> cadeia) {
		cadeia.sorted();
		return cadeia;
		
	}

}
