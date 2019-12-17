package aplicacoes;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileManipulandoPastas {
	// Esta classe exibe as Pastas e subpastas em ordem alfabetica de um diretorio
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma pasta para o listar as pastas internas: ");
	    String caminhoPasta = sc.nextLine();
		
		
		List<String> subPastas = new ArrayList<String>();
		List<String> subPastasAExibir = null;
		
		File pasta = new File(caminhoPasta);
		
		// colocando uma função como argumento de outra função File::isDirectory
		// assim como se faz nos predicados, usando reference methods
		// aqui criamos um vetor com as pastas que estão dentro da pasta informada
		File[] pastas = pasta.listFiles(File::isDirectory);
		
		System.out.println("Pastas: ");
		for ( File pastaUnica : pastas) {
			System.out.println(pastaUnica);
			subPastas.add(pastaUnica.toString());
			subPastasAExibir = new ArrayList<String>();
			while (subPastas.size() > 0) {
				procuraPastas(subPastas, subPastasAExibir);
				subPastas.remove(0);
			}
			ordenaListString(subPastasAExibir);
			for( String pastaSubs : subPastasAExibir) {
				System.out.println(pastaSubs);
			}
		}
		
		// criando pastas
		
		boolean criado = new File(caminhoPasta + "\\PastaJavaCriada").mkdir();
		System.out.println("Pasta foi criada ?:" + criado);
		
	}
	// Passando List com generics como argumento para uma função
	public static void procuraPastas(List<String> pastasAProcurar, List<String> subsAExibir) {
		
		File subPasta = new File(pastasAProcurar.get(0));
		File[] subPastas = subPasta.listFiles(File::isDirectory);
		
		if (subPastas != null) {
			for (File subs : subPastas) {
				pastasAProcurar.add(subs.toString());
				subsAExibir.add(subs.toString());
	//			System.out.println(subs);
			}
		}
		//return subPastas;
		
	}
	// Como ordenar uma lista de Strings
	public static void ordenaListString(List<String> lista) {
		Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
	}

}
