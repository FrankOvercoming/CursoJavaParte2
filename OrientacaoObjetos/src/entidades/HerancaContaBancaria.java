package entidades;

public class HerancaContaBancaria {

	
	private Integer numeroConta;
	private String nomeTitular;
	protected Double saldo;
	
	// modificador de acesso protected, fez com que a classe ContaBancariaEmpresa pudesse acessar 
	// a variavel saldo, pois com ela sendo private a subclasse não pode acessar, porem sendo
	// protected a subclasse pode acessar mas sem que outros possam acessar
	// Regra para protected
	public HerancaContaBancaria() {
		
		
	}
	
	public HerancaContaBancaria(Integer numeroConta, String nomeTitular, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
// final evita que o metodo seja sobreposto
	public final Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(Double valor) {
		
		saldo -= valor + 5;
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}

	
	
}
