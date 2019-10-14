package entidades;

public class ProdutoConstrutor {
	public String nome;
	public double preco;
	public int quantidade;
	
	public ProdutoConstrutor() {
		
		
	}
	
	public ProdutoConstrutor(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public ProdutoConstrutor(String nome, double preco) {

		this.nome = nome;
		this.preco = preco;
		quantidade = 0;

	}
	
	
	public double valorTotalDosProdutos() {
		
		return quantidade * preco;
	}
	
	public void adicionaQuantidade(int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void removeQuantidade(int quantidadeARemover) {
		this.quantidade -= quantidadeARemover;
		
	}
	
	public String toString() {
		return "Produto: " + this.nome 
				+ ", Quantidade: " + this.quantidade
				+ ", Preço: " + this.preco
				+ ", Valor total: U$ " 
				+ String.format("%.2f", this.valorTotalDosProdutos());
	}

}
