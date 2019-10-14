package aplicacoes;

import java.util.Scanner;

import entidades.ProdutoConstrutor;

public class VetorDeObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero de produtos: ");
		String nomeProduto;
		double precoProduto;
		ProdutoConstrutor[] produtos = new ProdutoConstrutor[sc.nextInt()];
//		double[] tamanho = new double[sc.nextInt()];
//		double valorTotal = 0;
		for( int i=0; i < produtos.length; i++) {
			System.out.println("Informe nome produto: ");
			nomeProduto = sc.next();
			System.out.println("Informe preco produto: ");
			precoProduto = sc.nextDouble();
			produtos[i] = new ProdutoConstrutor(nomeProduto, precoProduto);
		}
		
		for ( int h=0; h < produtos.length; h++) {
			System.out.println(produtos[h].toString());		
		}
	}

}
