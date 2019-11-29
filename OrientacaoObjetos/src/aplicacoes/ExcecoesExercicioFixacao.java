package aplicacoes;

import java.util.Scanner;

import entidades.ExcecoesExercicioFixacaoContaBancaria;
import entidades.excecoes.ExcecoesExercicioFixacaoExcecao;

public class ExcecoesExercicioFixacao {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados da conta");
		try {
			System.out.println("Numero da conta: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.println("Correntista: ");
			String nomeCliente = sc.nextLine();
			System.out.println("Saldo: ");
			Double saldo = sc.nextDouble();
			System.out.println("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			ExcecoesExercicioFixacaoContaBancaria conta = new ExcecoesExercicioFixacaoContaBancaria(numero, nomeCliente, saldo, limiteSaque);
			System.out.println();
			System.out.println("Entre valor a sacar: ");
			Double valorASacar = sc.nextDouble();
			conta.saque(valorASacar);
			System.out.println("Novo saldo: " + conta.getSaldo());
		}
		catch (ExcecoesExercicioFixacaoExcecao e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
