package entidades;

import java.util.Date;

public class InterfaceAluguelDeCarros {
	
	private Date dataInicio;
	private Date dataFim;
	
	// Arqui temos uma associa��o de objeto onde o objeto InterfaceAluguelDeCarros associa
	// o objeto InterfaceVeiculo e o mesmo acontece com as duas associa��es no caso
	// tamb�m a associa��o InterfaceNotaFiscal
	private InterfaceVeiculo veiculo;
	private InterfaceNotaFiscal nota;
	
	// Alguns frameworks exigem construtor padr�o, mas nem sempre � necess�rio
	public InterfaceAluguelDeCarros() {
		// TODO Auto-generated constructor stub
	}

	public InterfaceAluguelDeCarros(Date dataInicio, Date dataFim, InterfaceVeiculo veiculo) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.veiculo = veiculo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public InterfaceVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(InterfaceVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public InterfaceNotaFiscal getNota() {
		return nota;
	}

	public void setNota(InterfaceNotaFiscal nota) {
		this.nota = nota;
	}
	
	
	
	
}
