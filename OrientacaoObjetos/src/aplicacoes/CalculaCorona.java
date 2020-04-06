package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class CalculaCorona {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPrimeira;
		Locale.setDefault(Locale.FRANCE);
		dataPrimeira = sdf.parse("26/02/2020");
		Date dataAgora = new Date();
		long diferenca = dataAgora.getTime() - dataPrimeira.getTime();
		
		long dias = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
		System.out.println(dataPrimeira);
		System.out.println(dataAgora);
		System.out.println(dias);
		
	}

}
