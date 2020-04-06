package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entidades.ConsumerAtualizaPrecoInterface;
import entidades.ConsumerProduto;

public class Consumers {
	
	
	public static void main(String[] args) {
		
		List<ConsumerProduto> lista = new ArrayList<>();
		
		lista.add(new ConsumerProduto("Maquina de Lavar", 1299.99));
		lista.add(new ConsumerProduto("Geladeira", 900.90));
		lista.add(new ConsumerProduto("Fogao", 656.56));
		lista.add(new ConsumerProduto("Secadora" , 899.12));
		
		System.out.println(lista);
		
		lista.forEach(new ConsumerAtualizaPrecoInterface());
		// Interface funcional Consumer te um metodo accept que executa qualquer
		// coisa que estiver dentro para cada objeto da coleção, segue o mesmo esquema da 
		// Predicate e usa também funcoes anonimas lambda, tem a mesma funcao servir de link
		// para uma função lambda anonima
		// Regra para Consumer
		// Regra para Lambda
		
		// O forEach executa um Consumer para cada item da lista ou uma função
		// lambda ou um reference method
		// Regra para forEach
		// Regra para reference method
		
		lista.forEach(System.out::println);
		
		lista.forEach(ConsumerProduto::atualizaPreco);
		// Aqui também o mesmo esquema do Predicate, vamos chamar por reference method
		// uma função que está no ConsumerProduto
		// Regra para reference method
		// Regra para referencia para metodo
		// Regra para ::
		
		System.out.println(lista);
		
		lista.forEach(ConsumerProduto::atualiaPrecoNaoEstatico);
		// Aqui usamos um metodo nao estatico mas ainda passamos ele como referencia
		// usando reference methods
		
		
		System.out.println(lista);
		
		double porcento = 1.1;
		Consumer<ConsumerProduto> prod = (p) -> { 
			double pegaPorcento = porcento;
			p.setPreco(p.getPreco() * pegaPorcento);
		};
		// Aqui usamos uma funcao lambda declarada assim como no exemplo do Predicates
		// podemos até usar uma variavel para mudar o valor que quisermos e podemos 
		// também abrir chaves e criar uma função complexa com mais recursos se quisermos
		// Regra para lambda
		// Regra para expressão lambda
		// Regra para função lambda
		// Regra para ->
		
		
		lista.forEach(prod);
		
		System.out.println(lista);
		
		lista.forEach(p -> p.setPreco(p.getPreco() * porcento));
		// Aqui usamos uma expressão lambda inline é a mesma do que acima porem numa
		// unica linha
		// Regra para lambda
		// Regra para expressão lambda
		// Regra para função lambda
		// Regra para ->
		
		System.out.println(lista);
	}
	
	

}
