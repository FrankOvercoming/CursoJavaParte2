package entidades;

public class PolimorfismoEmpregadoTerceirizado extends PolimorfismoEmpregado {

	public PolimorfismoEmpregadoTerceirizado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PolimorfismoEmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora) {
		super(nome, horas, valorPorHora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double pagamento() {
		super.pagamento();
		pagamento += pagamento + (pagamento /10);
		return pagamento;
	}
	
	
	
}
