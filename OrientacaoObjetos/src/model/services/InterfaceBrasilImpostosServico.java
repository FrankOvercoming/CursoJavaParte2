package model.services;

public class InterfaceBrasilImpostosServico {
	
	
	// Aqui n�o ser� usado o Double Wrapper porque n�o precisa aceitar nulos
	// pois sempre haver� um valor base a ser calculado e sempre haver� um valor do
	// imposto a ser retornado, mesmo que seja zero
	// O wrapper do double � usado mais para objetos que ser�o usados com banco de dados
	// pois o campo no banco de dados pode conter valor nulo e tipos primitivos como double
	// n�o aceitam nulo, somente suas classes Wrapper como Double por exemplo
	public double impostos(double valorBase) {
		
		if (valorBase <= 100.0) {
			return valorBase * 0.2;
		} else
			return valorBase * 0.15;
		
	}

}
