package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceExercicioFixacaoParcelaContrato {
	
	private Date dataParcela;
	private Integer numeroParcela;
	private Double valorParcela;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public InterfaceExercicioFixacaoParcelaContrato() {
		
	}

	public Date getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String toString() {
		return sdf.format(getDataParcela()) + " - " + getValorParcela();
	}
	
	
	
}
