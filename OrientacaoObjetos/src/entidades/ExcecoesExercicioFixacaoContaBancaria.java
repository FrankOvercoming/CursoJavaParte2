package entidades;

import entidades.excecoes.ExcecoesExercicioFixacaoExcecao;

public class ExcecoesExercicioFixacaoContaBancaria {
	private Integer numeroConta;
	private String nomeCliente;
	private Double saldo;
	private Double limiteSaque;
	
	public ExcecoesExercicioFixacaoContaBancaria() {
		
	}
	
	public ExcecoesExercicioFixacaoContaBancaria(Integer numeroConta, String nomeCliente, Double saldo,
			Double limiteSaque) {
		
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}



	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void saque(Double valorASacar) throws ExcecoesExercicioFixacaoExcecao {
		if (valorASacar > limiteSaque) {
			throw new ExcecoesExercicioFixacaoExcecao("Limite de saque excedido");
		}	
		if (valorASacar > saldo) {
			throw new ExcecoesExercicioFixacaoExcecao("Saldo insuficiente");
		}
	
		saldo -= valorASacar;
	}
	
	public void deposito(Double valorADepositar) {
		saldo += valorADepositar;
	}
}
