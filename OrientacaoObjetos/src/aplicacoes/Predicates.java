package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entidades.PredicateProduto;
import entidades.PredicateProdutoInterfacePredicate;

public class Predicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PredicateProduto> lista = new ArrayList<>();
		
		lista.add(new PredicateProduto("TV", 899.11));
		lista.add(new PredicateProduto("Tablet", 1345.44));
		lista.add(new PredicateProduto("Notebook", 3500.10));
		lista.add(new PredicateProduto("Mouse", 50.00));
		
		// Predicate é uma interface funcional que tem como todas as interfaces funcionais
		// apenas um metodo abstrato chamado test que retorna um booleano
		// esta classe é usada como alvo para expressões lambda
		// como uma funcao lambda aponta internamente para uma interface funcional
		// então quando vamos testar condições a lambda usa internamente essa interface
		// funcional e por isso podemos implementa-la e usar a classe com a implementação
		// da interface funcional predicate em vez de usar a expressao lambda
		
		lista.removeIf((p) -> p.getPreco() < 100.00);
		// Aqui chamamos uma função anonima lambda que na verdade o java internamente
		// aponta para uma implementação da interface funcional Predicate
		// abaixo vamos fazer usando uma classe para implementar a interface funcional 
		// Predicate
		// Interface funcional é uma interface que contém apenas um metodo abstrato
		// internamente uma expressão lambda é tratada como uma interface funcional
		// Regra para Interface Funcional
		// Regra para expressao lambda
		System.out.println(lista);
		
		lista.removeIf( new PredicateProdutoInterfacePredicate(100.00) );
		// Por aqui podemos verificar que em vez de usar uma funcao lambda anonima
		// criamos uma classe chamada PredicateProdutoInterfacePredicate que implementa
		// a interface funcional Predicate e é passada agora como objeto do removeIf
		// Fiz aqui um teste e funcionou eu passando parametro para a classe que 
		// implementa a interface funcional Predicate, então não é só a funcao
		// lambda que da pra fazer isso
		// Regra para interface funcional
		// Regra para funcao lambda anonima
		
		System.out.println(lista);
		
		lista.removeIf(PredicateProduto::retornaPredicate );
		// Aqui em vez de usarmos funcao lambda ou interface funcional usamos um
		// reference methods static ou referencia para metodos estaticos, onde através dos :: 
		// passamos um metodo estatico para a funcao removeIf
		// Regra para predicate com reference method
		// Regra para reference method
		// Regra para ::
		
		
		System.out.println(lista);
		
		lista.removeIf(PredicateProduto::retornaPredicateNaoStatic);
		// Aqui também usamos reference method porem não estatico, sendo assim la na funcao
		// criada na classe não colocamos parametro pois como nao é uma funcao estatica
		// o objeto ja esta instanciado pois pertence a instancia e não a classe como
		// no caso de funções static
		// Regra para predicate com reference method
		// Regra para reference method
		// Regra para ::
		
		System.out.println(lista);
		
		double min = 100.00;
		
		Predicate<PredicateProduto> pred = (prod1) -> prod1.getPreco() < min;
		
		lista.removeIf(pred);
		// Neste caso usamos uma variável do tipo Predicate e passamos pra ela uma expressao
		// anonima lambda, poderiamos ter passado tammbém uma classe que implementasse
		// a interface anonima Predicate, internamente é como se a funcao anonima lambda
		// criasse uma classe com a implementação da interface predicate por isso podemos
		// usar ela como parametro pois se torna um objeto de primeira classe
		// reparando que eu usei como parametro uma variavel criada antes a double min
		// usando uma funcao lambda é possivel passar parametros usando variaveis para
		// a funcao lambda
		// Regra para funcao lambda
		// Regra para Predicate
		
		System.out.println(lista);
		
		double min2 = 100.00;
		
		
		lista.removeIf( (prod1) -> prod1.getPreco() < min2);
		// Mesma solução do que acima porem sem criar a variável, pois a funcao lambda
		// ja cria isso internamente
		// Regra para funcao lambda
		// Regra para Predicate
		
		System.out.println(lista);
		
	}

}
