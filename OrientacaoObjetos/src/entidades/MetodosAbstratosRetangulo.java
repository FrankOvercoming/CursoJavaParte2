package entidades;

import entidades.enums.Cores;
import frameworkking.Numeros;

public class MetodosAbstratosRetangulo extends MetodosAbstratosForma {
	
	private Double altura;
	private Double largura;



	public MetodosAbstratosRetangulo() {
		super();
	}


	public MetodosAbstratosRetangulo(Cores cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}



	public Double getAltura() {
		return altura;
	}



	public void setAltura(Double altura) {
		this.altura = altura;
	}



	public Double getLargura() {
		return largura;
	}



	public void setLargura(Double largura) {
		this.largura = largura;
	}



	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Numeros.NumeroTruncaDecimais(altura * largura , 2);
	}

}
