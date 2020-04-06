package model.services;

import java.time.Duration;
import java.time.Instant;

import entidades.InterfaceAluguelDeCarros;
import entidades.InterfaceNotaFiscal;

public class InterfaceAluguelServico {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	// Aqui temos uma associa��o de objetos pois estamos adicionando um objeto
	// InterfaceBrasilImpostosServico dentro de outro objeto que � o InterfaceAluguelServico
	// Regra para Associa��o de Objetos
	// Este tipo de associa��o � chamada de acoplamento forte, porque se houver uma mudan�a
	// de impostos por exemplo para os EUA, preciso criar uma classe de EUAImpostosServico
	// e vir aqui e mudar, usando interface isso muda e se torna um acoplamento fraco
	// Regra para Acoplamento
		// private InterfaceBrasilImpostosServico brasilImposto; Substituido pela interface
	
	
	// Usando esta interface evitamos um acoplamento forte assim quem chamar esta classe 
	//  tem que criar a implementacao para a variavel impostos assim a classe nunca � mexida
	// se precisar criar um tipo novo de imposto, antes era preciso modificar a varivel acima
	// brasilImposto agora n�o mais - Regra para Interface
	private InterfaceImpostosInterfaceServico impostos;

	public InterfaceAluguelServico(Double precoPorDia, Double precoPorHora,
			InterfaceImpostosInterfaceServico imposto) {
		// Aqui neste construtor estamos fazendo uma inje��o de dependencia com a variavel
		// imposto do tipo InterfaceImpostosInterfaceServico, pois agora esta classe n�o
		// tem mais um objeto fico como o InterfaceBrasilImpostosServico, ela recebe a 
		// inje��o deste objeto por quem a chama, usando ela a Interface InterfaceImpostosInterfaceServico
		// assim quem chamar esta classe pode injetar qualquer tipo de objeto que implemente
		// a Interface InterfaceImpostosInterfaceServico
		// Regra para Interface
		// Regra para Acoplamento
		
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.impostos = imposto;
	}
	
	public void processaNota(InterfaceAluguelDeCarros aluguelCarros) {
		// Calculo de diferen�a entre datas
		// Podemos fazer pegando o valor em milissegundos da data e tirar a diferen�a
		// este valor � dado em long
		// Regra para calculo de tempo
		// Regra para calculo de intervalo entre datas
		long tempoInicio = aluguelCarros.getDataInicio().getTime();
		long tempoFim = aluguelCarros.getDataFim().getTime();
		long diferenca = tempoFim - tempoInicio;
		double horas = (double) (diferenca  / 1000D / 60D / 60D);
		
		
		// Calculo de diferen�a entre datas usando Instant e Duration
		Instant dataInicio = aluguelCarros.getDataInicio().toInstant();
		Instant dataFim = aluguelCarros.getDataFim().toInstant();
		Duration duracao = Duration.between(dataInicio, dataFim);
		double horasInstant = duracao.toMinutes();
		
		
		double pagamentoBase;
		if (horas <= 12) {
			// Math.ceil arredonda para o proximo valor superior
			pagamentoBase = Math.ceil(horas) * precoPorHora;
		} else
			pagamentoBase = Math.ceil(horas / 24) * precoPorDia;
		
		double imposto = impostos.imposto(pagamentoBase);
		
//		double imposto = brasilImposto.impostos(pagamentoBase); // Substituido pela interface
		
		aluguelCarros.setNota(new InterfaceNotaFiscal(pagamentoBase, imposto));
		
		
	}
	
	
}
