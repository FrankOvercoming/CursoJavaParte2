package aplicacoes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEscritaArquivos {
	// Esta classe cria um arquivo texto usando
	// FileWriter e BufferedWriter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa Noite"};
		String caminho = "C:\\temp\\arquivoTextoEscrito.txt";
		
		try ( 
				// Se usar true no FileWriter ele acrescenta no arquivo se não ele cria
				// o arquivo do zero, mas se colocar true e o arquivo não existir
				// ele cria do mesmo jeito
				FileWriter fw = new FileWriter(caminho, true);
				BufferedWriter bw = new BufferedWriter(fw);
				){
				for (String linha : linhas ) {
					bw.write(linha);
					bw.newLine();
				}
				System.out.println("Arquivo criado ou completado com sucesso !!");
		} catch (IOException erro) {
			System.out.println("Erro ao criar arquivo - " + erro.getMessage());
		}
		
	}

}
