package entidades;

public class ConsumerProduto {
	private String nome;
	private Double preco;
	
	public ConsumerProduto(String nome, Double preco) {
		
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
		return nome + " - " +  String.format("%.2f", preco); 
	}
	
	public static void atualizaPreco(ConsumerProduto prod) {
		// Sem esquecer que aqui usamos a variavel prod pois p metodo é estátivo logo
		// ele não tem objeto instanciado e pertence a classe como um todo
		// então precisamos passar o ConsumerProduto pois ele não é uma instancia desta
		// classe
		// Regra para reference method
		// Regra para referencia de metodo
		// Regra para ::
		prod.setPreco(prod.getPreco() * 1.1);
		
	}
	
	public void atualiaPrecoNaoEstatico() {
		this.setPreco(this.getPreco() * 1.1);
		
	}
	
}
