package entidades;

public class ProdutoModificadoresDeAcesso {
	String nome; // sem nenhum modificador de acesso s� pode ser acesso por
	// outra classe se estiver no mesmo pacote !!!
	private double preco;
	private int quantidade;
	
	

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
