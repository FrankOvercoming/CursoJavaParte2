package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import entidades.excecoes.ExcecoesPersonalizadasExcecao;

public class ExcecoesPersonalizadasReservas {
	
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	// Estando declarado como estatico n�o � instanciado a cada novo objeto e sim apenas
	// uma vez, pois pertence a classe e n�o ao objeto
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public ExcecoesPersonalizadasReservas(Integer numeroQuarto, Date checkIn, Date checkOut) throws ExcecoesPersonalizadasExcecao {
		Date agora = new Date();
		if ( checkIn.before(agora) || checkOut.before(agora) ) {
			// Lan�ando essa exce��o no construtor tb vamos nos beneficiar do try/catch utilizado
			// na fun��o que utiliza este objeto, sem que precisemos mudar nada na fun��o
			// que cria este objeto se a instancia��o estiver ja entre Try/catch
			throw new ExcecoesPersonalizadasExcecao("Data de checkIn ou checkOut n�o pode ser anterior a data atual");
		} else if(checkIn.after(checkOut)){
			throw new ExcecoesPersonalizadasExcecao("Data de checkIn n�o pode ser posterior a data de checkOut");
		}
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


	public void atualizaDatas(Date checkIN, Date checkOUT) throws ExcecoesPersonalizadasExcecao {
		
		Date agora = new Date();
		if ( checkIN.before(agora) || checkOUT.before(agora) ) {
			// Lan�ando uma exce��o que ja existe no java sem ter que criar uma classe de exce��o
			// particular, no caso como � um argumento invalido ou checkIn ou checkOut
			// ent�o podemos lan�ar a IllegalArgumentException
			// Ao lan�ar uma exce��o devemos trata-la, deveriamos colocar essa linha do throw
			// entre um try/catch, por�m como queremos que a fun��o que chama esta classe
			// trate o erro ent�o propagamos a exce��o na assinatura do metodo atrav�s
			// do comando throws, no caso da IllegalArgumentException o compilador n�o
			// exigiu a propaga��o porque ela herda a classe RuntimeException que n�o exige
			// tratamento try/catch
			// throw new IllegalArgumentException("Data de checkIn ou checkOut n�o pode ser anterior a data atual");
			
			
				// Agora vamos lan�ar uma exce��o personalizada
			    // Ao lan�ar uma exce��o devemos trata-la, deveriamos colocar essa linha do throw
			    // entre um try/catch, por�m como queremos que a fun��o que chama esta classe
			    // trate o erro ent�o propagamos a exce��o na assinatura do metodo atrav�s
			    // do comando throws
				throw new ExcecoesPersonalizadasExcecao("Data de checkIn ou checkOut n�o pode ser anterior a data atual");

		} else if(checkIN.after(checkOUT)){
			throw new ExcecoesPersonalizadasExcecao("Data de checkIn n�o pode ser posterior a data de checkOut");
		} else {	
		
			this.checkIn = checkIN;
			this.checkOut = checkOUT;
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
