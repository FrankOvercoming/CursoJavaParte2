package entidades;

public class MapsProduto implements Comparable<MapsProduto> {
	private String nome;
	private Double preco;
	
	public MapsProduto(String nome, Double preco) {
		super();
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

	@Override
	public int compareTo(MapsProduto o) {
		// TODO Auto-generated method stub
		Integer saida = null;
		saida = this.nome.compareTo(o.nome);
		if (saida == 0) {
			return this.preco.compareTo(o.preco);
		} else
			return saida;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
	
}
