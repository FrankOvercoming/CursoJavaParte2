package entidades;

import java.util.function.Function;

public class FunctionProdutoInterface2Teste implements Function<FunctionProduto , FunctionProduto> {

	@Override
	public FunctionProduto apply(FunctionProduto prod) {
		// TODO Auto-generated method stub
		prod.setNome(prod.getNome().toUpperCase());
		return prod;
	}

}
