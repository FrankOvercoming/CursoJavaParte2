package model.services;

public class InterfaceBrasilImpostosServico implements InterfaceImpostosInterfaceServico {
	
	
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

	
	// Agora esta classe implementa uma Interface assim eu tenho um baixo acoplamento na
	// classe InterfaceAluguelServico pois não uso mais uma classe em especifico e sim uma
	// interface, assim sendo quando eu for instancia a classe InterfaceAluguelServico eu 
	// indico uma implementacao para esta Interface assim eu posso trocar de servico de imposto
	// sem ter que mexer na classe InterfaceAluguelServico, no caso a implementação usada
	// será esta InterfaceBrasilImpostosServico, mas eu poderia criar uma outra sem ter que 
	// mexer na classe InterfaceAluguelServico - Regra para Interface
	
	@Override
	public Double imposto(Double valorBase) {
		// TODO Auto-generated method stub
		return impostos(valorBase);
	}

}
