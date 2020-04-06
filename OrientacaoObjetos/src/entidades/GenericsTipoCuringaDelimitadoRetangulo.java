package entidades;

public class GenericsTipoCuringaDelimitadoRetangulo implements GenericsTipoCuringaDelimitadoInterfaceShape {

	private double altura;
	private double largura;
	
	public  GenericsTipoCuringaDelimitadoRetangulo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public GenericsTipoCuringaDelimitadoRetangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}



	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}




	public double getLargura() {
		return largura;
	}




	public void setLargura(double largura) {
		this.largura = largura;
	}




	@Override
	public double area() {
		// TODO Auto-generated method stub
		return altura * largura;
	}

	
	
}
