package entidades;

public class FunctionProduto {
	private String nome;
	private Double preco;
	
	public FunctionProduto(String nome, Double preco) {
		
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
	
	@Override
	public String toString() {
		return nome + " - " + preco;
	}

	public static String toUpperCase(FunctionProduto prod) {
		return prod.getNome().toUpperCase();
	}
	
	public String toUpperCaseNoStatic() {
		return this.getNome().toUpperCase();
	}
	
}
