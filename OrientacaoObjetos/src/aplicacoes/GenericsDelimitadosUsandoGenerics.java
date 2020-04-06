package aplicacoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.GenericsDelimitadosCalculoServico;
import entidades.GenericsDelimitadosProduto;
import entidades.GenericsImpressaoServicoComGenerics;

public class GenericsDelimitadosUsandoGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<GenericsDelimitadosProduto> lista = new ArrayList<>();
		String caminhoArq = "c:\\temp\\listaProdutosGenericsDelimitados.txt";
		List<GenericsDelimitadosProduto> maisCaros = new ArrayList<GenericsDelimitadosProduto>();
		
		File arquivo = new File(caminhoArq);
		
		try(
				FileReader flr = new FileReader(arquivo);
				BufferedReader bfr = new BufferedReader(flr);  
				){
			String linha = bfr.readLine();
			String[] campos;
			while(linha != null) {
				try {
					GenericsDelimitadosProduto produto = new GenericsDelimitadosProduto();
					campos = linha.split(",");
					produto.setNome(campos[0]);
					produto.setPreco(Double.parseDouble(campos[1]));
					lista.add(produto);
					
				} catch (Exception e) {
					System.out.println("Linha com problema: " + linha);
				} finally {
					linha = bfr.readLine();
				}
				
			}
			
		//	System.out.println("Tamanho da lista: " + lista.size());
			List<GenericsDelimitadosProduto> maximo = GenericsDelimitadosCalculoServico.maximo(lista);
		//	System.out.println("Tamanho da lista maximo: " + maximo.size());
			GenericsImpressaoServicoComGenerics<GenericsDelimitadosProduto> imprime = new GenericsImpressaoServicoComGenerics<GenericsDelimitadosProduto>();
			// Verifiquei que o toString de um objeto tipo List<> da uma saida toString
			// padrão dos itens, em colchetes separados por virgula
			// isto é, o toString do list chama o toString do objeto que está
			// dentro do List e assim imprime e separa por virgula e coloca tudo
			// entre colchetes
			// Regra para List
			// Regra para toString
			// Regra para List<>
			System.out.println("toString de List: " + lista);
			System.out.println("Mais caro: " + maximo);
	//		System.out.println("Lista dos numeros");
			imprime.setLista(lista);
			imprime.imprimir();

			//System.out.println("Valor máximo da lista: " + maximo);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
