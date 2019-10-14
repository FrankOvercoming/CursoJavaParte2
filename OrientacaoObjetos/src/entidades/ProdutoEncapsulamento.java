package entidades;

public class ProdutoEncapsulamento {
	private String nome;
	private double preco;
	private int quantidade;
	
	public ProdutoEncapsulamento() {
		
	}
	
	public ProdutoEncapsulamento(String nome, double preco, int quantidade) {
		super(); // Chama o construtor da classe que est� sendo herdada, quando
		// a classe herda alguma outra
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}
	


	public String getNome() {
		return nome;
		
	}
	
	public void setPreco(double preco) {
		
		this.preco = preco;
		
	}
	
	public double getPreco() {
		
		return preco;
	}
	
	public int getQuantidade() {
		
		return quantidade;
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
		return "Produto: " + this.nome + ", Quantidade: " + this.quantidade
				+ ", Valor total: U$ " + String.format("%.2f", this.valorTotalDosProdutos());
	}

}
