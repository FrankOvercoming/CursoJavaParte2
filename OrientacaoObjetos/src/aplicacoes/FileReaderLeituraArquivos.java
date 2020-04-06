package aplicacoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLeituraArquivos {
	// o FileReader é um streamer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\temp\\arquivotexto.txt";
		// Conteudo do arquivo arquivotexto.txt
		//		bom dia
		//		boa tarde
		//		oi e vamos que vamos
		
		FileReader fl = null;
		BufferedReader bf = null;
		
		try {
			fl = new FileReader(path);
			// Buffered aumenta a velocidade de leitura pois coloca o arquivo em cache na 
			// memoria
			bf = new BufferedReader(fl);
			
			String line = bf.readLine();
			while (line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if (fl != null)
						fl.close();
					if (bf != null)
						bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
