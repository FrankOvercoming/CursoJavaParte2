package entidades;

import entidades.enums.InterfaceComHerancaCor;

public abstract class InterfaceComHerancaFormaAbstrata implements InterfaceComHerancaFormaInterface {
	
	private InterfaceComHerancaCor cor;
	
	public InterfaceComHerancaFormaAbstrata(InterfaceComHerancaCor cor) {
		this.cor = cor;
	}


	public InterfaceComHerancaCor getCor() {
		return cor;
	}



	public void setCor(InterfaceComHerancaCor cor) {
		this.cor = cor;
	}



}
