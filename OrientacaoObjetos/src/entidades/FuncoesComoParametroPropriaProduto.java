package entidades;

public class FuncoesComoParametroPropriaProduto {
	
	private String nome;
	private Double preco;
	
	public FuncoesComoParametroPropriaProduto(String nome, Double preco) {
		
		this.nome = nome;
		this.preco = preco;
		
	}
	
	// Teste
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return this.preco;
	}
	
	
	// Teste3
	@Override
	public String toString() {
		return nome + " - " + preco;
		
	}
	


}
