package entidades;

import java.text.DecimalFormat;

public class Circulo {
	
	// Uso da palavra final nume declaração de variavel a torna uma constante
	// a variável não pode ser modificada, pois tudo que leva final não pode algo
	// Regra para final
	public static final double PI = 3.14159;
	public static DecimalFormat df = new DecimalFormat("0.00");
	
	public static double circunferencia(double raio) {
		double saida = PI * raio * 2;
		//System.out.println("Valor sem formatar: " + saida);
		return formataCasasDecimais(saida);
	}
	
	public static double area(double raio) {
		double saida = PI * Math.pow(raio, 2);
		//System.out.println("Valor sem formatar: " + saida);
		return formataCasasDecimais(saida);
		
	}
	
	public static double volumeEsfera(double raio) {
		double saida = 4 * PI * Math.pow(raio, 3) / 3;
		//System.out.println("Valor sem formatar: " + saida);
		return formataCasasDecimais(saida);
	}
	
	private static double formataCasasDecimais(double valor) {
		//System.out.println("Valor sem formatar: " + valor);
		String entrada = df.format(valor);
		double saida  = Double.parseDouble(entrada);
		return saida;
	}
}
