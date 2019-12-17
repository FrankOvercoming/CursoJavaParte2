package aplicacoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Este arquivo texto é um arquivo texto qualquer com umas 3 linhas com
		// qualquer coisa escrita, só para teste mesmo
		String path = "C:\\temp\\arquiv2otexto.txt";
		// Este try com parenteses é o try with resources, que veio a partir da versão 7 do java
		// assim eu posso declarar as variáveis que serão usadas dentro do try aqui entre os 
		// parenteses e não preciso usar o finally para chamar o close() dessas variáveis
		// evitando assim o tratamento do erro desses close()s também
		try (
				FileReader fl = new FileReader(path);
				BufferedReader bf = new BufferedReader(fl);
				) {
			
			String line = bf.readLine();
			while (line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Usando o try with resources eu não preciso chamar o close das variáveis declaradas
		// no parenteses do Try, o sistema mesmo fecha dando o close automaticamente
		// sendo assim não preciso criar o finally e tratar os fechamentos dos closes caso
		// eles também deem problema quando fechados, o sistema ja faz isso no próprio catch
		// do try
//		finally {
//			
//				try {
//					if (fl != null)
//						fl.close();
//					if (bf != null)
//						bf.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//		}
	}

}
