package model.services;

import entidades.InterfaceAluguelDeCarros;

public class InterfaceAluguelServico {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	// Aqui temos uma associação de objetos pois estamos adicionando um objeto
	// InterfaceBrasilImpostosServico dentro de outro objeto que é o InterfaceAluguelServico
	private InterfaceBrasilImpostosServico brasilImposto;

	public InterfaceAluguelServico(Double precoPorDia, Double precoPorHora,
			InterfaceBrasilImpostosServico brasilImposto) {
	
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.brasilImposto = brasilImposto;
	}
	
	public void processaNota(InterfaceAluguelDeCarros aluguelCarros) {
		
	}
	
	
}
