package model.services;

public class InterfaceExercicioFixacaoCalculaParcelaPayPalServico implements InterfaceExercicioFixacaoCalculaParcelasInterfaceServico {

	@Override
	public double valorparcelado(Double valorOrigem, Integer numeroParcela) {
		// TODO Auto-generated method stub
		double saida = valorOrigem + ( valorOrigem * 0.01 * numeroParcela);
		return saida + (saida * 0.02);
	}

}
