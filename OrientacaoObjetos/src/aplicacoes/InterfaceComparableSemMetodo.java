package aplicacoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.ProdutoConstrutor;

public class InterfaceComparableSemMetodo {

	public static void main(String[] args) {
		String path = "C:\\temp\\listaNomes.txt";
		List<String> lista = new ArrayList<>();
		File arq = new File(path);
		
		try (
				FileReader fr = new FileReader(arq);
				BufferedReader br = new BufferedReader(fr);
				
				){
			String linha = br.readLine();
			while (linha != null) {
				lista.add(linha);
				linha = br.readLine();
			}
			// Operacao padrão para ordenar uma coleção padrão do java
			// Regra para Ordenação
			// Regra para Coleção
			// Regra para Comparable
			Collections.sort(lista);
			for(String valor : lista) {
				System.out.println(valor);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

		
	}
	
}
