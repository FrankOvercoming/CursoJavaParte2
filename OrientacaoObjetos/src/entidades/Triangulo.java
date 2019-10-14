package entidades;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	public double areaTriangulo;
	
	public double calculaAreaTriangulo() {
		
		double saida;
		double p = ( a + b + c ) / 2;
		double areaX = Math.sqrt(p * ( p - a ) * ( p - b) * ( p -c )  );
		saida = areaX;
		areaTriangulo = saida;
		return saida;
	}
}
