package aplicacoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyBloco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\temp\\texto.txt");
		Scanner sc = null;
		try{
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());				
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Arquivo: " + file.getName() + " não foi encontrado" );
		}
		// bloco finally é executado de qualquer forma, dando erro e caindo no catch
		// ou não dando nenhum erro
		// geralmente esse bloco é usado para isso mesmo, fechar arquivos abertos ou banco
		// de dados abertos
		finally {
			if ( sc != null)
				sc.close();
			System.out.println("Bloco finally executado");
		}
	}

}
