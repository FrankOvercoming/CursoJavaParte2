package aplicacoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entidades.StreamExercicioResolvidoProduto;
import frameworkking.Numeros;

public class StreamExercicioResolvido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\temp\\listaStream.txt";
		
		try( FileReader fr = new FileReader(path);
			 BufferedReader br = new BufferedReader(fr);
			 
		){
	
			List<StreamExercicioResolvidoProduto> lista = new ArrayList<>();
			long qtd2 = br.lines().map( p -> {
				return p.split(",");
			}).map( p -> {
				lista.add(new StreamExercicioResolvidoProduto(p[0], Double.parseDouble(p[1]) ));
				return p;
			}).count();
			// Esta linha faz a mesma coisa que a linha abaixo do qtdProds porem
			// usando melhor a transformação do map do Stream
			
			System.out.println("Tentativa 2: " + qtd2 + lista);
			
			
			long qtdProds = br.lines().map( p-> {
				//System.out.println(p);
				String[] conteudo = p.split(",");
				lista.add(new StreamExercicioResolvidoProduto(conteudo[0], Double.parseDouble(conteudo[1]) ));				
				return p;
			}).count();
			// Aqui usamos um Stream no BufferedReader assim conseguimos preencher a lista
			// e ainda fazer a contagem dos itens
			// Regra para Stream Count
			// Regra para contagem de itens com Stream
			// Regra para BufferedReader com Stream
			
			Double total = lista.stream().map( p -> p.getPreco()).reduce(0.0, (a,b) -> a+b);
			// Aqui fazemos a somatória de todos os preços de todos os objetos da lista
			// como o stream é sobre o list e o list é de objetos StreamExercicioResolvidoProduto
			// e só queremos o preço, então aplicamos um map para retornar um Stream
			// apenas com os preços e depois aplicamos o reduce que faz a somatória
			// Regra para somatória Stream
			// Regra para reduce de objetos
			// Regra para pegar campo de objeto no Stream
			
			Double media = total / qtdProds;
			
			System.out.println(lista);
			System.out.println("Total dos preços: " + total);

			System.out.println("Media dos preços: " + media );
			
			List<StreamExercicioResolvidoProduto> listaSaida =  lista.stream().filter( p -> p.getPreco() < media )
					.sorted(new Comparator<StreamExercicioResolvidoProduto>() {

						@Override
						public int compare(StreamExercicioResolvidoProduto o1, StreamExercicioResolvidoProduto o2) {
							// TODO Auto-generated method stub
							return o1.getNome().compareTo(o2.getNome());
						}
					}.reversed() )
					.collect(Collectors.toList());
			// Aqui criamos um filtro para gerar um stream apenas com os preços que forem menores
			// do que a média dos preços depois fazemos uma ordenação criando uma classe anonima
			// do tipo Comparator para fazer uma ordenação pelos itens que queremos e 
			// depois usamos o método default reversed da interface Comparator
			// e por fim geramos uma list com isso tudo
			// Regra para ordenação reversa
			// Regra para ordenação invertida
			// Regra para filtro stream
			
			//
			
			System.out.println("Lista saida ordem decrescente: " + listaSaida);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
	}

}
