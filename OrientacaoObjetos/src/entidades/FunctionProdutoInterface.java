package entidades;

import java.util.function.Function;

public class FunctionProdutoInterface implements Function<FunctionProduto, String> {

	@Override
	public String apply(FunctionProduto prod) {
		// TODO Auto-generated method stub
		return prod.getNome().toUpperCase();
	}

}
