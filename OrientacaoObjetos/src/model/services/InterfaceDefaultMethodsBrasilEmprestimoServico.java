package model.services;

import java.security.InvalidParameterException;

public class InterfaceDefaultMethodsBrasilEmprestimoServico implements InterfaceDefaultMethodsEmprestimoServico {

	private Double taxaDeEmprestimo;
	
	
	public InterfaceDefaultMethodsBrasilEmprestimoServico(Double taxaDeEmprestimo) {
		this.taxaDeEmprestimo = taxaDeEmprestimo;
		
	}
	
	
	public Double getTaxaDeEmprestimo() {
		
		return this.taxaDeEmprestimo;
	}
	
	public Double calculaValorEmprestimo(Double valorAEmprestar, Integer meses) {
		
		if (meses < 1) {
			// Usando InvalidParameterException não precisa adicionar throws
			// Regra para erros
			// Regra para Exceptions
			
			throw new InvalidParameterException("Quantidade de meses precisa ser maior do que 1");
		}
		
		
		return valorAEmprestar * (Math.pow(1 + (taxaDeEmprestimo / 100), meses));
	}

	
	
}
