package aplicacoes;

import java.util.Scanner;

import entidades.ProdutoConstrutor;



public class ProdutosConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		ProdutoConstrutor produto = new ProdutoConstrutor();
		
//		System.out.println("Produto: " + produto.nome);
//		System.out.println("Quantidade: " + produto.quantidade);
//		System.out.println("Pre�o: " + produto.preco);
//		System.out.println("Valor Total: " + produto.valorTotalDosProdutos());
//		
		System.out.println("Digite o produto a adicionar: ");
		
		String nome = sc.next();
		System.out.println("Digite o valor do produto: ");
		double preco = sc.nextDouble();
		char saida = 's';
		ProdutoConstrutor produto = new ProdutoConstrutor(nome, preco);
		System.out.println(produto);
		
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		produto.adicionaQuantidade(quantidade);
		
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

