package model.services;

import java.security.InvalidParameterException;

public interface InterfaceDefaultMethodsEmprestimoServico {
	// Cria��o de classe usando metodo default
	// dessa forma n�o preciso criar uma classe abstrata para que a tenha 
	// metodos que s�o usados em comum por outras classes que a herdam
	// eu posso criar uma interface que agora a partir do java 8 aceita
	// metodos dentro dela, sendo apenas preciso colocar como metodo default
	// Regra para metodos default
	// Regra para default methods
	// Regra para Interface default
	
	Double getTaxaDeEmprestimo();
	
	default Double calculaValorEmprestimo(Double valorAEmprestar, Integer meses) {
		
		if (meses < 1) {
			// Usando InvalidParameterException n�o precisa adicionar throws
			// Regra para erros
			// Regra para Exceptions
			
			throw new InvalidParameterException("Quantidade de meses precisa ser maior do que 1");
		}
		
		
		return valorAEmprestar * (Math.pow(1 + (getTaxaDeEmprestimo() / 100), meses));
		// aqui eu n�o tenho acesso a variavel taxaDeEmprestimo, mas tenho acesso a fun��o
		// getTaxaDeEmprestimo que ser� implementada pela classe que herdar essa
		// interface ent�o eu posso usar para pegar o valor da taxa de empr�stimo
		// Regra para metodos default
		// Regra para default methods
		// Regra para Interface default
	}
		
}
