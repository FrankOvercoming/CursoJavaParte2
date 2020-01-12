package entidades;

import entidades.enums.InterfaceComHerancaCor;

public class InterfaceComHerancaCirculo extends InterfaceComHerancaFormaAbstrata {
	
	private Double raio;
	
	// Esta classe extend InterfaceComHerancaForma que � uma classe abstrata
	// como existe um metodo abstrato que � o metodo area ent�o esta classe tem
	// que implementar obrigatoriamente esse metodo abstrato da classe abstrata
	// uma classe abstrata n�o pode ser instanciada
	
	public InterfaceComHerancaCirculo(InterfaceComHerancaCor cor, Double raio) {
		// TODO Auto-generated constructor stub
		super(cor);
		this.raio = raio;
	}

	
	
	public Double getRaio() {
		return raio;
	}



	public void setRaio(Double raio) {
		this.raio = raio;
	}



	@Override
	public Double area() {
		// TODO Auto-generated method stub
		// Calculo da area do circulo usando Math PI
		return Math.PI * raio *raio;
	}

}
