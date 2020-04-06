package entidades;

import java.util.ArrayList;
import java.util.List;

public class GenericsDelimitadosCalculoServico<TipoGenerico> {
	
	public static <TipoGenerico extends Comparable<? super TipoGenerico>> List<TipoGenerico> maximo(List<TipoGenerico> lista) {
		// Para acharmos o item maximo da lista o nosso tipo generico precisa implementar
		// a interface comparable ent�o precisamos avisar o java que o TipoGenerico
		// que a gente informar ter� a implementa��o da interface Comparable
		// para isso colocamos assim: <TipoGenerico extends Comparable<TipoGenerico>>
		// assim dizemos para o compilador que o tipo informado para essa classe ter�
		// a implementa��o da fun��o compareTo e que portanto implementa a classe Comparable
		// Regra para Generics
		// Regra para Comparable
		// Regra para compara��o
		// Regra para comparacao
		// Regra para maximo
		// Regra para achar o maximo
		
		// <? super TipoGenerico> aqui entendemos que � um tipo comparavel TipoGenerico
		// ou qualquer super classe do TipoGenerico, porque se houver alguma super classe
		// que implementa o compareTo do TipoGenerico o sistema ir� aceitar pois o
		// TipoGenerico herdou o compareTo, do contrario tem que ter a implementa��o
		// do compareTo na pr�pria classe do TipoGenerico
		// Regra para Comparable
		// Regra para Genericos Curinga
		// Regra para Generics
		// Regra para ? super T
		// Regra para Generics curinga
		
		
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista est� vazia");
			
		}
		List<TipoGenerico> maiores = new ArrayList<TipoGenerico>();
			TipoGenerico maior = lista.get(0);
			maiores.add(lista.get(0));
		for ( TipoGenerico item : lista) {
			if (item.compareTo(maior) > 0) {
				maiores.clear();
				maior = item;
				maiores.add(item);
			} else if(item.compareTo(maiores.get(0)) == 0 ) {
				maiores.add(item);
			}
		}
		
		return maiores;
	}

}
