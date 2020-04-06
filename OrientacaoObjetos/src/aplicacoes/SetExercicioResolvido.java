package aplicacoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entidades.SetExercicioResolvidoUsuarioLog;

public class SetExercicioResolvido {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static Date data1 = new Date();

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		List<HashSet> listaSet = new ArrayList<>();
		String path = "c:\\temp\\logSetExercicio.txt";
		File arq = new File(path);
		Set<SetExercicioResolvidoUsuarioLog> cja = new HashSet<>();
		
		try (
				FileReader fr = new FileReader(arq);
				BufferedReader br = new BufferedReader(fr);
				){
			
			String linha = br.readLine();
			String conteudo[];
			while (linha != null) {
				conteudo = linha.split(" ");
				SetExercicioResolvidoUsuarioLog usuario = 
						new SetExercicioResolvidoUsuarioLog(conteudo[0], 
								retornaData(pegaData(conteudo[1])));
				cja.add(usuario);
				linha = br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total de usuários: " + cja.size() );
		System.out.println(sdf.format(data1));
		
		
	}
	public static String pegaData(String dataIso) {

		String dataString = "2018-08-26T20:45:08Z";
		TemporalAccessor ta = DateTimeFormatter.ISO_INSTANT.parse(dataIso);
		Instant ins = Instant.from(ta);
		data1 = Date.from(ins);
		// Date data1 = Date.from(Instant.parse(dataIso)); // Poderia ter sido feito assim
		return sdf.format(data1);
		// Aqui usamos a classe TemporalAccessor e a Instant para transformar a data
		// que está vindo no padrão ISO 8601, mas poderiamos ter feito assim:
		// Date data1 = Date.from(Instant.parse(dataIso)); porém parece que o java 8
		// trabalha com esse TemporalAccessor, melhor estudar isso no livro de datas
		//do java
		// Regra para Data
		// Regra para Transformar Data
		// Regra para ISO 8601
		// Regra para Data ISO
	}
	
	public static Date retornaData(String dataValor) {
		Date retorno = null;
		try {
			retorno = sdf.parse(dataValor);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}

}
