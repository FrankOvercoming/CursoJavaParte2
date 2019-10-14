package entidades;

public class HerancaContaPoupanca extends HerancaContaBancaria {
	private Double taxaJuros;
	
	public HerancaContaPoupanca() {
		
	}
	
	
	public HerancaContaPoupanca(Integer numeroConta, String nomeTitular, Double saldo, Double taxaJuros) {
		super(numeroConta, nomeTitular, saldo);
		this.taxaJuros = taxaJuros;
}

	

	public Double getTaxaJuros() {
		return taxaJuros;
	}


	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}


	public void atualizaSaldoComJuros() {
		saldo += (saldo * taxaJuros) / 100;
		
	}
	
	// Palavra override faz o compilador veriricar se realmente este m�todo est� sobreescrevendo
	// o mesmo metodo com a mesma assinatura no classe pai
	@Override
	public void saque(Double valor) {
		saldo -= valor;
	}
	
}
