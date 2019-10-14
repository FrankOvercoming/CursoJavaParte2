package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
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
		return "Produto: " + this.nome + ", Quantidade: " + this.quantidade
				+ ", Valor total: U$ " + String.format("%.2f", this.valorTotalDosProdutos());
	}

}
