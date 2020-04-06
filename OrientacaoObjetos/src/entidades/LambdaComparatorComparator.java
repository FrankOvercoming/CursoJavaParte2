package entidades;

import java.util.Comparator;

public class LambdaComparatorComparator implements  Comparator<LambdaComparatorProduto> {

	@Override
	public int compare(LambdaComparatorProduto o1, LambdaComparatorProduto o2) {
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}
	
	// Esta classe será usada para o sort do list 
	// A interface comparator exige um objeto a ser comparado no caso é LambdaComparatorProduto
	
	

}
