package entidades;

import java.util.function.Predicate;

public class PredicateProdutoInterfacePredicate implements Predicate<PredicateProduto> {

	private double min;
	public PredicateProdutoInterfacePredicate(double min) {
		this.min = min;
	}
	
	@Override
	public boolean test(PredicateProduto prod) {
		// TODO Auto-generated method stub
		return prod.getPreco() < this.min;
	}

}
