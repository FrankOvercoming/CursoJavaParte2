package entidades;

import java.util.function.Consumer;

public class ConsumerAtualizaPrecoInterface implements Consumer<ConsumerProduto> {

	@Override
	public void accept(ConsumerProduto prod) {
		// TODO Auto-generated method stub
		prod.setPreco(prod.getPreco() * 1.1);
	}

}
