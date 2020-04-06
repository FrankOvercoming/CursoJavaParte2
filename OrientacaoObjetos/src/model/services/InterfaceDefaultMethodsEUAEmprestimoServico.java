package model.services;

import java.security.InvalidParameterException;

public class InterfaceDefaultMethodsEUAEmprestimoServico implements InterfaceDefaultMethodsEmprestimoServico {

	private Double taxaDeEmprestimo;
	
	
	public InterfaceDefaultMethodsEUAEmprestimoServico(Double taxaDeEmprestimo) {
		this.taxaDeEmprestimo = taxaDeEmprestimo;
		
	}
	
	
	public Double getTaxaDeEmprestimo() {
		
		return this.taxaDeEmprestimo;
	}
	

	
	
	
}
