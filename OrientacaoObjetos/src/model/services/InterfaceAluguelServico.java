package model.services;

import entidades.InterfaceAluguelDeCarros;

public class InterfaceAluguelServico {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	// Aqui temos uma associa��o de objetos pois estamos adicionando um objeto
	// InterfaceBrasilImpostosServico dentro de outro objeto que � o InterfaceAluguelServico
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
