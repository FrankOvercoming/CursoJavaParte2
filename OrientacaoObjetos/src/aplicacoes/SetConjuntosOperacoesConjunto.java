package aplicacoes;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetConjuntosOperacoesConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		Set<Integer> c = new TreeSet<>(a);
		// Aqui a instancia��o de um novo objeto cria uma copia do conjunto a
		c.addAll(b);
		System.out.println(c);
		// Opera��o de uni�o de conjuntos
		// Junta todos os itens sem repetir dos doiso conjuntos
		// Regra para set
		// Regra para conjuntos
		// Regra para uni�o de conjuntos
		
		Set<Integer> d = new TreeSet<Integer>();
		d.addAll(a);
		d.retainAll(b);
		System.out.println(d);
		// Opera��o de intersec��o de conjuntos
		// Pega somente os valores que tem nos dois conjuntos
		// Regra para Set
		// Regra para conjuntos
		// Regra para Intersec��o 
		
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		// Opera��o de diferen�a de conjuntos
		// Remove todo mundo do conjunto 
		// Regra para Set
		// Regra para conjuntos
		// Regra para diferen�a 
					
	}

}
