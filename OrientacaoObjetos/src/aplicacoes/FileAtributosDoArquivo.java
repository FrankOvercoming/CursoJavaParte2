package aplicacoes;

import java.io.File;
import java.util.Scanner;

public class FileAtributosDoArquivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informa o arquivo com o caminho completo: ");
		
		// String arquivoComCaminho = sc.nextLine();
		
		String arquivoComCaminho = "C:\\temp\\arquivoTextoEscrito.txt";
		
		File arquivo = new File(arquivoComCaminho);
		
		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("Caminho do arquivo: " + arquivo.getParent());
		
		
		
	}
	
}
