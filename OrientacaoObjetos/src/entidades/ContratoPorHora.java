package entidades;

import java.util.Date;

public class ContratoPorHora {
	private Date dataContrato;
	private Double valorPorHora;
	private Integer qtdHoras;
	
	public ContratoPorHora() {
		
	}

	public ContratoPorHora(Date dataContrato, Double valorPorHora, Integer qtdHoras) {
		this.dataContrato = dataContrato;
		this.valorPorHora = valorPorHora;
		this.qtdHoras = qtdHoras;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(Integer qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
	public Double valorTotalContrato() {
		return valorPorHora * qtdHoras;
	}
	
	
	
}
