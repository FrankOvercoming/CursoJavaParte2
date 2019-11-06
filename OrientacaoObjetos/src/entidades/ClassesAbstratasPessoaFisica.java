package entidades;

public class ClassesAbstratasPessoaFisica extends ClassesAbstratasPessoas {

	private Double valorSaude;
	
	public ClassesAbstratasPessoaFisica() {
		
	}
	
	
	public ClassesAbstratasPessoaFisica(String nome, Double rendaAnual, Double valorSaude) {
		super(nome, rendaAnual);
		this.valorSaude = valorSaude;
	}

	
	
	public Double getValorSaude() {
		return valorSaude;
	}




	public void setValorSaude(Double valorSaude) {
		this.valorSaude = valorSaude;
	}



	@Override
	public Double calculoImposto() {
		// TODO Auto-generated method stub
		Double saida = 0D;
		Double impostoAPagar = 0D;
		Double valorRenda = getRendaAnual();
		if (valorRenda < 20000.00) {
			impostoAPagar = (valorRenda * 15D) / 100D;
		} else
			impostoAPagar = (valorRenda * 25.00) / 100.00;
		
		if (valorSaude > 0) {
			impostoAPagar -= (valorSaude * .5); 
		}
		
		return impostoAPagar;
	}

}
