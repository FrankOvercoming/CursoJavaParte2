package frameworkking;

import java.util.Locale;

public class Numeros {
	
	public static double NumeroTruncaDecimais(double valorATruncar, int qtdDecimais) {
		
		return Math.round((valorATruncar * Math.pow(10, qtdDecimais))) / 100D;
		
	}

	public static String NumeroTruncaDecimais(String numero, int qtdDecimais) {
		
		Locale.setDefault(Locale.US);
		double numeroSaida = Double.parseDouble(numero);
		return String.format("%." + qtdDecimais + "f", numeroSaida);
		
	}
	
}
