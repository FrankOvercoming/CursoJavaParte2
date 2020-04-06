package aplicacoes;

import java.util.ArrayList;
import java.util.List;

import entidades.ProgramacaoFuncionalProduto;

public class ProgramacaoFuncionalLambdaFuncoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ProgramacaoFuncionalProduto> lista = new ArrayList<>();
		
		lista.add(new ProgramacaoFuncionalProduto("TV", 899.00) );
		lista.add(new ProgramacaoFuncionalProduto("Notebook", 1800.34));
		lista.add(new ProgramacaoFuncionalProduto("Tablet", 1435.22));
		
		lista.sort(ProgramacaoFuncionalLambdaFuncoes::comparaProgramacaoFuncionalProduto );
		// Aqui passamos uma função como argumento de outra função então na programação
		// funcional a função pode se tornar um objeto de primeira classe ou primeira ordem
		// pode também ser retornado como uma função
		// Regra para funções lambda
		// Regra para programação funcional
		// Regra para reference methods
		// Regra para referencia para metodo
		
		
		
		lista.forEach(System.out::println);
	
		
	}

	
	public static int comparaProgramacaoFuncionalProduto(ProgramacaoFuncionalProduto prod1, ProgramacaoFuncionalProduto prod2 ) {
		return prod1.getNome().compareToIgnoreCase(prod2.getNome());
	}
}
