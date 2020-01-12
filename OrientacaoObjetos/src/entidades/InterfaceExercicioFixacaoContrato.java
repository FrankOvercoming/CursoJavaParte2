package entidades;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.services.InterfaceExercicioFixacaoCalculaParcelasInterfaceServico;

public class InterfaceExercicioFixacaoContrato {
	private Long numeroContrato;
	private Date dataContrato;
	private Double valorContrato;
	private Integer numeroParcelas;
	private InterfaceExercicioFixacaoCalculaParcelasInterfaceServico calculaParcela;
	
	private List<InterfaceExercicioFixacaoParcelaContrato> listaParcelas = new ArrayList<InterfaceExercicioFixacaoParcelaContrato>();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public InterfaceExercicioFixacaoContrato() {
		
	}
	
	public InterfaceExercicioFixacaoContrato(Long numeroContrato, Date dataContrato, Double valorContrato,
			Integer numeroParcelas) {
		
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
		this.numeroParcelas = numeroParcelas;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	public void setCalculaParcela(InterfaceExercicioFixacaoCalculaParcelasInterfaceServico calculaParcelas) {
		this.calculaParcela = calculaParcelas;
	}
	
	
	public List<InterfaceExercicioFixacaoParcelaContrato> getListaParcelas() {
		return listaParcelas;
	}

	public void setListaParcelas(List<InterfaceExercicioFixacaoParcelaContrato> listaParcelas) {
		this.listaParcelas = listaParcelas;
	}

	public void geraParcelas(){
		Instant dataProximoMes = this.dataContrato.toInstant();
		List<String> saida = new ArrayList<>();
		Date dataParcelaAtual;
		double valorParcelaAtual = 0;
		// aqui vamos fazer uma soma de datas usando calendar
		Calendar dataCalcula = Calendar.getInstance();
		dataCalcula.setTime(dataContrato);
		
		for ( int i = 1; i <= numeroParcelas; i++) {
			// Usando calendar para somar 1 mes na data atual ja colocada no calendar
			// soma de mes usando calendar
			dataCalcula.add(Calendar.MONTH, 1);
			dataProximoMes = dataProximoMes.plusSeconds(30*24*60*60);
			valorParcelaAtual = calculaParcela.valorparcelado(valorContrato, i);
			// dataParcelaAtual = Date.from(dataProximoMes);
			dataParcelaAtual = dataCalcula.getTime();
			InterfaceExercicioFixacaoParcelaContrato parcela = 
					new InterfaceExercicioFixacaoParcelaContrato();
			parcela.setDataParcela(dataParcelaAtual );
			parcela.setValorParcela(valorParcelaAtual);
			listaParcelas.add(parcela);
			
		//	saida.add(sdf.format(dataParcelaAtual) + " - " + valorParcelaAtual);
		}
		
	}
	
	
}
