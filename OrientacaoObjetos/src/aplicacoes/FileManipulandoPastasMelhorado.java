package aplicacoes;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileManipulandoPastasMelhorado {
	// Esta classe exibe as Pastas e subpastas em ordem alfabetica de um diretorio
	// porem sem usar ordenação, usando apenas a saida padrão do comando listFiles que 
	// pelo visto ja traz as pastas de forma ordenada
	// Esta classe foi melhorada pois alem de não perder tempo de processamento reordenando as pastas
	// ela vai exibindo as pastas conforme vai procurando
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma pasta para o listas as pastas e subpastas internas: ");
	   // String caminhoPasta = sc.nextLine();
		
//	    String caminhoPasta = "c:\\contas";
	    
	    String caminhoPasta = "c:\\windows";
		
		List<String> subPastas = null;
		List<String> subPastasAExibir = null;
		
		File pasta = new File(caminhoPasta);
		
		// colocando uma função como argumento de outra função File::isDirectory
		// assim como se faz nos predicados, usando reference methods
		// aqui criamos um vetor com as pastas que estão dentro da pasta informada
		File[] pastas = pasta.listFiles(File::isDirectory);
		
		System.out.println("Pastas: ");
		for ( File pastaUnica : pastas) {
			//System.out.println(pastaUnica);
			int indice = 0;
			subPastas = new ArrayList<String>();
			subPastas.add(pastaUnica.toString());
			subPastasAExibir = new ArrayList<String>();
			String nome[] = { "teste", "casa", "carro" };
			// Arqui foi usado para dar stop no programa
		
//			String pastaPara = pastaUnica.toString().substring(0, 13);
//			System.out.println(pastaPara);
//			if ( pastaPara.equals("c:\\contas\\360")) {
//				boolean pare = true; // stop nesta linha que não serve pra nada alem de receber a
									// marcação de ponto de debug para o debug parar aqui
//			}
			while (true) {
				procuraPastas(subPastas, subPastasAExibir, indice);
				System.out.println(subPastas.get(indice));
//				subPastas.remove(0);
				if (subPastas.size() == indice + 1) {
					break;
				} else
					indice++;
			}
			//ordenaListString(subPastasAExibir); // Aqui era usado na primeira classe
			// que não era melhorada
			
//			for( String pastaSubs : subPastas) {
//				System.out.println(pastaSubs);
//			}
		}
		System.out.println("Pastas e subpastas listadas com sucesso !!!");
	}
	// Passando List com generics como argumento para uma função
	public static void procuraPastas(List<String> pastasAProcurar, List<String> subsAExibir, int indice) {
		
		// subsAExibir não usa, mas deixa ai para servir de exemplo pra algo
		
		File subPasta = new File(pastasAProcurar.get(indice));
		File[] subPastas = subPasta.listFiles(File::isDirectory);
		
		if (subPastas != null) {
			int contagem = indice;
			for (File subs : subPastas) {
				contagem++;
				pastasAProcurar.add(contagem, subs.toString());
				subsAExibir.add(subs.toString());
	//			System.out.println(subs);
			}
		}
		//return subPastas;
		
	}
	// Como ordenar uma lista de Strings
	// Esta funcao de ordenação não é usada nesta classe
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
