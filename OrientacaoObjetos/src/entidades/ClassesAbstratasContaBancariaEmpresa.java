package entidades;

public class ClassesAbstratasContaBancariaEmpresa extends ClassesAbstratasContaBancaria {
	
	private Double limiteEmprestimo;


	public ClassesAbstratasContaBancariaEmpresa() {
		super(); // chamar o super() para se acaso tiver alguma rotina pra ser executada na classe pai, o java executar
	}
	
	public ClassesAbstratasContaBancariaEmpresa(Integer numeroConta, String nomeTitular, Double saldo, Double limiteEmprestimo) {
		super(numeroConta, nomeTitular, saldo); // chama o construtor da classe pai passando os argumentos
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(Double valor) {
		if (limiteEmprestimo <= valor) {
			saldo += valor - 10;
		}
		
	}
	@Override
	public void saque(Double valor) {
		super.saque(valor);
		saldo -= 2;
	}
	
}
