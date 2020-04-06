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
		lista.add(new FuncoesComoParametroPropriaProduto("Armario a�o", 100.21));
		lista.add(new FuncoesComoParametroPropriaProduto("Martelete Rompedor", 988.78));
		
		FuncoesComoParametroPropriasService servico = new FuncoesComoParametroPropriasService();
		
		Double saida = servico.somaPrecos(lista);
		
		// Esta fun��o somaPrecos est� com a regra de neg�cios dentro dela, queremos ent�o
		// em vez disso passar para ela uma express�o lambda ent�o vamos criar outra
		// fun��o nesta classe FuncoesComoParametroPropriasService
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
