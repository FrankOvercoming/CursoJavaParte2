package aplicacoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.GenericsDelimitadosCalculoServico;
import entidades.GenericsImpressaoServicoComGenerics;

public class GenericsDelimitados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = new ArrayList<>();
		String caminhoArq = "c:\\temp\\listaNumeros.txt";

		// Conteudo do arquivo listaNumeros.txt
		// 	3
		//	1
		//	-2
		//	190
		//	34
		//	54
		//	11
		//	48
		//	-4059
		//	0
		//	12
		//	111
		File arquivo = new File(caminhoArq);
		
		try(
				FileReader flr = new FileReader(arquivo);
				BufferedReader bfr = new BufferedReader(flr);  
				){
			String linha = bfr.readLine();
			while(linha != null) {
				lista.add(Integer.parseInt(linha) );
				linha = bfr.readLine();
			}
			// Aqui achamos o valor maximo usando o compareTo na classe 
			// GenericsDelimitadosCalculoServico
			// Regra para valor maximo
			// Regra para achar o maximo
			List<Integer> maximo = GenericsDelimitadosCalculoServico.maximo(lista);
			GenericsImpressaoServicoComGenerics<Integer> imprime = new GenericsImpressaoServicoComGenerics<Integer>();
			imprime.setLista(lista);
			imprime.imprimir();
			imprime.setLista(maximo);
			// System.out.println("Size da lista maximo: " + maximo.size());
			System.out.println("Valor máximo da lista: " + maximo);
			imprime.imprimir();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
