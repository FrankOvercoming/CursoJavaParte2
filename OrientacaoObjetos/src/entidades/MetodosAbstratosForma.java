package entidades;

import entidades.enums.Cores;

public abstract class MetodosAbstratosForma {

	private Cores cor;
	
	public MetodosAbstratosForma() {
		
	}
	
	public MetodosAbstratosForma(Cores cor) {
		super();
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}

	// um metodo abstrato é usado quando se deseja que os herdeiros da classe implementem este metodo para que ele seja
	// usado de forma polimorfica, ou seja, que usando esta classe abstrata o metodo se adapte conforme o herdeiro que
	// o  chama
	// Todo metodo abstrato só pode estar numa classe abstrata
	public abstract Double area();
	
}
