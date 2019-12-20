package model.services;

public class InterfaceBrasilImpostosServico {
	
	
	// Aqui não será usado o Double Wrapper porque não precisa aceitar nulos
	// pois sempre haverá um valor base a ser calculado e sempre haverá um valor do
	// imposto a ser retornado, mesmo que seja zero
	// O wrapper do double é usado mais para objetos que serão usados com banco de dados
	// pois o campo no banco de dados pode conter valor nulo e tipos primitivos como double
	// não aceitam nulo, somente suas classes Wrapper como Double por exemplo
	public double impostos(double valorBase) {
		
		if (valorBase <= 100.0) {
			return valorBase * 0.2;
		} else
			return valorBase * 0.15;
		
	}

}
