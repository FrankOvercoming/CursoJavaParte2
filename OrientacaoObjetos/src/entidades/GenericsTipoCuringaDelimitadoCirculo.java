package entidades;

public class GenericsTipoCuringaDelimitadoCirculo implements GenericsTipoCuringaDelimitadoInterfaceShape {
	
	private double raio;
	
	public GenericsTipoCuringaDelimitadoCirculo() {
		
	}
	
	public GenericsTipoCuringaDelimitadoCirculo(double raio) {
		this.raio = raio;
	}
	
	
	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return raio * raio * Math.PI;
	}
	
	
	
	
}
