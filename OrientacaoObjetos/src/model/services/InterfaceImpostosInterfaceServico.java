package model.services;

public interface InterfaceImpostosInterfaceServico {
	
	
	// Neste caso aqui a interface está sendo usada para reduzir o acoplamento, deixando
	// um acoplamento fraco para a classe InterfaceAluguelServico
	// Regra para Interface
	// Regra para Acoplamento
	Double imposto(Double valorBase);
	
	
	
}
