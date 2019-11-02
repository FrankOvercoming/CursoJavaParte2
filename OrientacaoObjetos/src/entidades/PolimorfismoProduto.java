package entidades;

public class PolimorfismoProduto {
	
	private String nome;
	private Double preco;
	
	
	public PolimorfismoProduto() {
		
		
	}
	
	public PolimorfismoProduto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String etiquetaDePreco() {
		return nome + " $ " + preco;
	}

}
