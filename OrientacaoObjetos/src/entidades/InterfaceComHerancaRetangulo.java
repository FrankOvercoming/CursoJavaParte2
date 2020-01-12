package entidades;

import entidades.enums.InterfaceComHerancaCor;

public class InterfaceComHerancaRetangulo extends InterfaceComHerancaFormaAbstrata {

	private Double altura, largura;
	
	
	public InterfaceComHerancaRetangulo(InterfaceComHerancaCor cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
		
		// TODO Auto-generated constructor stub
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
		return altura * largura;
	}

}
