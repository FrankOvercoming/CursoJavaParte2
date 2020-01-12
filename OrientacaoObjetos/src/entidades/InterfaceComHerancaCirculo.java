package entidades;

import entidades.enums.InterfaceComHerancaCor;

public class InterfaceComHerancaCirculo extends InterfaceComHerancaFormaAbstrata {
	
	private Double raio;
	
	// Esta classe extend InterfaceComHerancaForma que é uma classe abstrata
	// como existe um metodo abstrato que é o metodo area então esta classe tem
	// que implementar obrigatoriamente esse metodo abstrato da classe abstrata
	// uma classe abstrata não pode ser instanciada
	
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
