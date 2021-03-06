package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedido {

	private Date dataPedido;
	private ProdutoModificadoresDeAcesso produto;
	

	
	
	public Pedido(Date dataPedido, ProdutoModificadoresDeAcesso produto) {
		this.dataPedido = dataPedido;
		this.produto = produto;
		produto.nome = "teste"; // S� pode ser acessado o parametro nome porque a classe
		// ProdutoModificadoresDeAcesso est� no mesmo pacote que esta classe Pedido
	}
	
	
	public Date getDataPedido() throws ParseException {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public ProdutoModificadoresDeAcesso getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModificadoresDeAcesso produto) {
		this.produto = produto;
	}

	
	
	
}
