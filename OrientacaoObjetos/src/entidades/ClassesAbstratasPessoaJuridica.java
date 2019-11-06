package entidades;

public class ClassesAbstratasPessoaJuridica extends ClassesAbstratasPessoas {
	
	private Integer numeroFuncionarios;

	public ClassesAbstratasPessoaJuridica() {
		
	}
	
	
	public ClassesAbstratasPessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}



	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}



	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public Double calculoImposto() {
		// TODO Auto-generated method stub
		Double impostoAPagar = 0.0;
		Double porcentagemImposto = 0.0;
		porcentagemImposto = (numeroFuncionarios > 10) ? 14.00 : 16.00;
		impostoAPagar = (getRendaAnual() * porcentagemImposto) / 100D;
		return impostoAPagar;
		
	}
	
	
	
}
