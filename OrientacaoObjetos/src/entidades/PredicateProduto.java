package entidades;

public class PredicateProduto {
	private String nome;
	private Double preco;
	
	public PredicateProduto(String nome, Double preco) {
		
		this.nome = nome;
		this.preco  =preco;
		
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
	
	public static boolean retornaPredicate(PredicateProduto prod) {
		return prod.getPreco() < 100;
		// Como este é um metodo estatico e vale para a classe toda e não para 
		// o objeto instanciado então passamos o argumento PredicateProduto prod
		// pois o metodo pode ser chamado sem existir instancia da classe
		// Regra para predicate com reference method
		// Regra para reference method
		// Regra para ::
	}
	
	public boolean retornaPredicateNaoStatic() {
		return this.getPreco() < 100;
		// Como este metodo não é estatico então não colocamos nenhum parametro
		// pois ja iremos possuir a instancia da classe
		// Regra para predicate com reference method
		// Regra para reference method
		// Regra para ::
		
	}

	
}
