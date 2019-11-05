package entidades;

import entidades.enums.Cores;
import frameworkking.Numeros;

public class MetodosAbstratosCirculo extends MetodosAbstratosForma {
	
	private Double raio;

	
	public MetodosAbstratosCirculo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MetodosAbstratosCirculo(Cores cor, Double raio) {
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
		return Numeros.NumeroTruncaDecimais(Math.PI * Math.pow(raio, 2),2) ;
	}
	

}
