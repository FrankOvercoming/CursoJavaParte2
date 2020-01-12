package javabasico;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataComCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SimpleDateFormat formata a saida da data em string
		// ou converte a data string para Date
		// Regra para datas
		// Regra para SimpleDateFormat
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data1 = new Date();
		
		imprime(data1);
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(data1);
		
		cal.add(Calendar.HOUR, 3);
		
		imprime(cal.getTime());
		
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("Imprime apenas hora: " + hora);
		
	}
	static public void imprime(Date hora) {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data: " + data.format(hora));
		
	}

}
