package entidades;

// Aplicacao da palavra final numa classe evita que ela seja herdada
// Regra para final
public final class HerancaContaPoupanca extends HerancaContaBancaria {
	private Double taxaJuros;
	
	public HerancaContaPoupanca() {
		
	}
	
	
	public HerancaContaPoupanca(Integer numeroConta, String nomeTitular, Double saldo, Double taxaJuros) {
		super(numeroConta, nomeTitular, saldo);
		this.taxaJuros = taxaJuros;
}

	
	// Uso da palavra final no metodo evita que ele seja sobreposto
	public final Double getTaxaJuros() {
		return taxaJuros;
	}


	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}


	public void atualizaSaldoComJuros() {
		saldo += (saldo * taxaJuros) / 100;
		
	}
	
	// Palavra override faz o compilador verificar se realmente este método está sobreescrevendo
	// o mesmo metodo com a mesma assinatura na classe pai
	@Override
	public void saque(Double valor) {
		saldo -= valor;
	}
	
}
