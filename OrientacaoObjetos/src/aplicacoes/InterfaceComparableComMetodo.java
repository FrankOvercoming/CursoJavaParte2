package aplicacoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.InterfaceComparableComMetodoFuncionario;

public class InterfaceComparableComMetodo {
	
	public static void main(String[] args) {
		String path = "C:\\temp\\listaNomesComNumeros.txt";
		List<InterfaceComparableComMetodoFuncionario> lista = new ArrayList<>();
		File arq = new File(path);
		
		InterfaceComparableComMetodoFuncionario funcionario;
		
		try (
				FileReader fr = new FileReader(arq);
				BufferedReader br = new BufferedReader(fr);
				
				){
			String linha = br.readLine();
			String[] camposFunc;
			while (linha != null) {
				camposFunc = linha.split(",");
				funcionario = new InterfaceComparableComMetodoFuncionario(camposFunc[0]
						, Double.parseDouble(camposFunc[1]));
				lista.add(funcionario);
				linha = br.readLine();		
			}
			// A classe InterfaceComparableComMetodoFuncionario precisa implementar o 
			// metodo comparable da Interface comparable senão não pode ser usada por
			// Collections.sort(lista);
			// Para verificar isso procuramos na documentação do javadoc, digitando no
			// google javadoc collections
			// Verificamos que essa classe tem o metodo sort e esse metodo aceita o tipo
			// generico T e esse tipo generico precisa implementar a interface comparable
			// vemos isso em sort(List<T> list) onde
			// static <T extends Comparable<? super T>> void
			// Regra para Comparable
			// Regra para ler documentação
			// Regra para ler documentacao
			// Regra para sort lista
			// Regra para javadoc
			// Regra para pesquisar documentação
			// Regra para pesquisar documentacao
			
			Collections.sort(lista);
			for( InterfaceComparableComMetodoFuncionario  valor : lista) {
				System.out.println(valor.getNome() + "," + valor.getSalario() );
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

		
	}
	

}
