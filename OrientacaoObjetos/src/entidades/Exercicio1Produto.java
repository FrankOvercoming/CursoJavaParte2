package entidades;

public class Exercicio1Produto {
	private String descricao;
	private Double preco;
	
	public Exercicio1Produto() {
		
	}

	public Exercicio1Produto(String descricao, Double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Exercicio1Produto [descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
	
	
}
