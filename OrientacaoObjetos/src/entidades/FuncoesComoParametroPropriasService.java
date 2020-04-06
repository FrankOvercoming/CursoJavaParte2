package entidades;

import java.util.List;
import java.util.function.Predicate;

public class FuncoesComoParametroPropriasService {

	public Double somaPrecos(List<FuncoesComoParametroPropriaProduto> lista) {
		Double total = 0.00;
		for (FuncoesComoParametroPropriaProduto prod : lista) {
			if (prod.getNome() != null) {
				if (prod.getNome().substring(0, 1).toUpperCase().equals("T")) {
					total += prod.getPreco();
				}
			}
		}

		return total;

	}

	public Double somaPrecosLambda(List<FuncoesComoParametroPropriaProduto> lista, Predicate<FuncoesComoParametroPropriaProduto> prodPred, boolean incluiNulos) {
		Double total = 0.00;
		for (FuncoesComoParametroPropriaProduto prod : lista) {
			if (prod.getNome() != null || incluiNulos) {
				if (prodPred.test(prod)) {
					// Agora usando um predicado esta funcao pode aceitar como parametro uma
					// express�o lambda pois colocamos mais um parametro que � um Predicate
					// que aceita fun��es lambda como parametros
					// Aqui a fun��o test do Predicate recebe o produto pois � ele que ser�
					// testado
					// Regra para lambda proprio
					// Regra para Predicate proprio
					// Regra para expressao lambda passada como parametro proprio
					
					total += prod.getPreco();
				}
			}
		}

		return total;

	}
	
}
