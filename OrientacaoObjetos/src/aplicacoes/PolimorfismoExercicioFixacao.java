package aplicacoes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.PolimorfismoProduto;
import entidades.PolimorfismoProdutoImportado;
import entidades.PolimorfismoProdutoUsado;

public class PolimorfismoExercicioFixacao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<PolimorfismoProduto> lista = new ArrayList<>();
		byte saida = 's';
		String nome;
		Double preco;
		byte tipo;
		while (saida == 's') {
			System.out.println("Produto #" + (lista.size() + 1) + " dados: " );
			System.out.println("Comum, Usado ou Importado ? (c,u,i)");
			tipo = sc.next().getBytes()[0];
			System.out.println("Nome do produto: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Preço: ");
			preco =sc.nextDouble();
			sc.nextLine();
			if ( tipo == 'i' | tipo == 'I') {
				System.out.println("Taxa de importação: ");
				lista.add(new PolimorfismoProdutoImportado(nome, preco, sc.nextDouble()));
			} else if ( tipo =='u' | tipo == 'U') {
				System.out.println("Data de fabricação: ");
				lista.add(new PolimorfismoProdutoUsado(nome, preco, sc.nextLine()));
			} else
				lista.add(new PolimorfismoProduto(nome, preco));
			System.out.println("Deseja continuar (S/N)");
			saida = sc.next().getBytes()[0];
		}
		System.out.println("Etiquetas de preços");
		for(PolimorfismoProduto produto: lista ) {
			System.out.println(produto.etiquetaDePreco());
		}
		
	}

}
