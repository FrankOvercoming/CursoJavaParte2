package aplicacoes;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileManipulandoArquivos {
	// Esta classe exibe as Pastas e subpastas em ordem alfabetica de um diretorio
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma pasta para listar os arquivos: ");
	    String caminhoPasta = sc.nextLine();
		
		
		File pasta = new File(caminhoPasta);
		
		// colocando uma função como argumento de outra função File::isFile
		// assim como se faz nos predicados, usando reference methods
		// aqui criamos um vetor com os arquivos que estão dentro da pasta informada
		File arquivos[] = pasta.listFiles(File::isFile);
		
		System.out.println("Arquivos: ");
		for ( File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
	}

}
