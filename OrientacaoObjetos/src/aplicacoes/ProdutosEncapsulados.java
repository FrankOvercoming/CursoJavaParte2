package aplicacoes;

import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoEncapsulamento;

public class ProdutosEncapsulados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o produto a adicionar: ");
		ProdutoEncapsulamento produto = new ProdutoEncapsulamento();
		produto.setNome(sc.next());
		System.out.println("Digite a quantidade: ");
		produto.adicionaQuantidade(sc.nextInt());
		System.out.println("Digite o valor do produto: ");
		produto.setPreco(sc.nextDouble());
		char saida = 's';
		System.out.println(produto);
		
		while ( saida != 'n') {
			System.out.println("Informe a quantidade a acrescentar: ");
			produto.adicionaQuantidade(sc.nextInt());
			System.out.println(produto);
			System.out.println("Informe a quantidade a remover: ");
			produto.removeQuantidade(sc.nextInt());
			System.out.println(produto);
			System.out.println("Deseja continuar ? (s/n)");
			saida = sc.next().charAt(0);
		}
		
		
		sc.close();
	}

}
