package entidades;

public class SetHashcodeEqualsProduto implements Comparable<SetHashcodeEqualsProduto> {
	private String nome;
	private Double preco;
	
	// Classe usada para mostrar o porque precisamos implementar o hashcode e equals
	// quando formos usar o Set para conjuntos
	// Regra para Set
	// Regra para Conjuntos
	// Regra para Hashcode
	// Regra para Equals
	public SetHashcodeEqualsProduto(String nome, Double preco) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetHashcodeEqualsProduto other = (SetHashcodeEqualsProduto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}


	@Override
	public int compareTo(SetHashcodeEqualsProduto o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(o.getNome());
		
	}


	@Override
	public String toString() {
		return nome + "-" + preco;
		// Aqui tivemos que implementar o metodo toString pois senão os dados não são
		// exibidos quando vamos printar um conjunto usando Set por exemplo
		// porque o Set internamente chama este metodo e se a classe não for padrão
		// do java, precisamos implementar esse metodo na classe
		// Regra para toString
		// Regra para Set
		// Regra para Conjunto Set
		// Regra para TreeSet
	}
	
	
	
	
}
