package aplicacoes;

import java.util.ArrayList;
import java.util.List;

import entidades.FuncoesComoParametroPropriaProduto;
import entidades.FuncoesComoParametroPropriasService;

public class FuncoesComoParametroProprias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FuncoesComoParametroPropriaProduto> lista = new ArrayList<>();
		
		lista.add(new FuncoesComoParametroPropriaProduto("Tablet", 1239.00));
		lista.add(new FuncoesComoParametroPropriaProduto("TV", 1100.12));
		lista.add(new FuncoesComoParametroPropriaProduto(null, 1135.43));
		lista.add(new FuncoesComoParametroPropriaProduto("Geladeira", 877.43));
		lista.add(new FuncoesComoParametroPropriaProduto("Forno Microondas", 567.43));
		lista.add(new FuncoesComoParametroPropriaProduto("Armario aço", 100.21));
		lista.add(new FuncoesComoParametroPropriaProduto("Martelete Rompedor", 988.78));
		
		FuncoesComoParametroPropriasService servico = new FuncoesComoParametroPropriasService();
		
		Double saida = servico.somaPrecos(lista);
		
		// Esta função somaPrecos está com a regra de negócios dentro dela, queremos então
		// em vez disso passar para ela uma expressão lambda então vamos criar outra
		// função nesta classe FuncoesComoParametroPropriasService
		// Regra para lambda proprio
		// Regra para Predicate proprio
		// Regra para expressao lambda passada como parametro proprio

		System.out.println(saida);
		
		Double saidaComPredicate = servico.somaPrecosLambda(lista, p -> p.getNome().substring(0, 1)
				.equals("T"), false);
		// Aqui em vez do filtro por inicio da letra T estar dentro da classe
		// eu passo uma expressao lambda como parametro
		// deixando a classe com baixo acoplamento
		// Regra para lambda proprio
		// Regra para Predicate proprio
		// Regra para expressao lambda passada como parametro proprio

		
		
		System.out.println(saidaComPredicate);
		
		Double saida2 = servico.somaPrecosLambda(lista, p -> p.getPreco() > 1000.0, true);
		
		System.out.println(saida2);
		
	}

}
