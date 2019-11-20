package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ExcecoesPersonalizadasReservas {
	
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	// Estando declarado como estatico n�o � instanciado a cada novo objeto e sim apenas
	// uma vez, pois pertence a classe e n�o ao objeto
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public ExcecoesPersonalizadasReservas(Integer numeroQuarto, Date checkIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	
	
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}



	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}



	public Date getCheckIn() {
		return checkIn;
	}



	public Date getCheckOut() {
		return checkOut;
	}


	public String atualizaDatas(Date checkIN, Date checkOUT) {
		
		Date agora = new Date();
		if ( checkIN.before(agora) || checkOUT.before(agora) ) {
			return ("Data de checkIn ou checkOut n�o pode ser anterior a data atual");
			
		} else if(checkIN.after(checkOUT)){
			return ("Data de checkIn n�o pode ser posterior a data de checkOut");
		} else {	
		
			this.checkIn = checkIN;
			this.checkOut = checkOUT;
			return "";
		}
	}
	
	//Calculo para diferen�a entre duas datas
	public Long duracao() {
		// pega o valor da data em milissegundos e faz a diferen�a
		long diferenca = checkOut.getTime() - checkIn.getTime();
		//Esta classe do java TimeUnit � um tipo enumerado complexo com algumas opera��es
		// neste caso vamos converter o valor em milissegundos da diferen�a em 
		// dias, � possivel converter em horas, minutos...
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS );
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Quarto: " + numeroQuarto + ", CheckIn: " + sdf.format(checkIn) +
				", CheckOut: " + sdf.format(checkOut) + ", Dias: " +
				this.duracao();
	}
	
	
	
	
}
