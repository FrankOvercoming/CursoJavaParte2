package entidades;

public class ProgramacaoFuncionalProduto {
	private String nome;
	private Double preco;
	
	public ProgramacaoFuncionalProduto(String nome, Double preco) {
		
		this.nome = nome;
		this.preco = preco;
		
	}
	
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
	
	@Override
	public String toString() {
		return nome + "-" + preco;
	}
	
}
