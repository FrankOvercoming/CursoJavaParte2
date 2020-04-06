package aplicacoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MapExercicioFixacao {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\mapsexerciciofixacao.txt";
		
		try (	FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);
				) {
			Map<String,Double> votos = new TreeMap<>();
			String linha = br.readLine();
			String conteudo[];
			Double qtdVotos = null;
			while(linha != null) {
				conteudo = linha.split(",");
				if ( votos.containsKey(conteudo[0])) {
					qtdVotos = Double.parseDouble(conteudo[1]) + votos.get(conteudo[0]);
				} else {
					qtdVotos = Double.parseDouble(conteudo[1]);
				}
				votos.put(conteudo[0], qtdVotos);
				linha = br.readLine();
			}
			System.out.println(votos);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
}
