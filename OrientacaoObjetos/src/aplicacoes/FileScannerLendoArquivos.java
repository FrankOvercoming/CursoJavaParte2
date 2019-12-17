package aplicacoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Abrindo arquivos texto usando File e Scanner
public class FileScannerLendoArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File arquivo = new File("C:\\temp\\arquivotexto.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro de abertura de arquivo. " + e.getMessage() );
		}
		// Usamos o bloco finally para que seja executado mesmo o try dando certo
		// ou acionando o catch, assim a variavel sc é fechada e não fica aberta em memoria
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
		
	}

}
