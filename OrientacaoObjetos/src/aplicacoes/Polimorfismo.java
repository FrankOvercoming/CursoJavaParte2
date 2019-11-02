package aplicacoes;

import entidades.HerancaContaBancaria;
import entidades.HerancaContaPoupanca;

public class Polimorfismo {
	//Polimorfismo é quando eu tenho metodos iguais que agem de forma diferente em diferentes objetos
	// sendo esses objetos herdados
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HerancaContaBancaria ct1 = new HerancaContaBancaria(1000, "jose das coves", 80D);
		HerancaContaBancaria ct2 = new HerancaContaPoupanca(1000, "mane das latas", 80D, 5.00);
		
		// neste caso ct1 e ct2 foram declarados como conta bancaria porém por upcasting o ct2
		// recebeu a conta do tipo poupança e o compilador não sabe que o metodo saque é diferente
		// somente na execução quando o objeto for instanciado que o java vai chamar o metodo certo
		// isso é a aplicação do polimorfismo
		ct1.saque(10D);
		ct2.saque(10D);
		System.out.println("Saldo conta ct1 " + ct1.getSaldo());
		System.out.println("Saldo conta ct2 " + ct2.getSaldo());
		
	}

}
