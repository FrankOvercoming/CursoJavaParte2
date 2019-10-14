package entidades;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1PedidoItens {
	private Integer quantidade;
	private Double preco = 0D;
	
	private Exercicio1Produto produto;
	
	public Exercicio1PedidoItens() {
		
	}

	
	public Exercicio1PedidoItens(Integer quantidade, Double preco, Exercicio1Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}



	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Exercicio1Produto getProduto() {
		return produto;
	}


	public void setProduto(Exercicio1Produto produto) {
		this.produto = produto;
	}


	public Double subTotal() {
		return preco * quantidade;
	}


	@Override
	public String toString() {
		return "Exercicio1PedidoItens [quantidade=" + quantidade + ", preco=" + preco + ", produto=" + produto + "]";
	}
	
	
	
}
