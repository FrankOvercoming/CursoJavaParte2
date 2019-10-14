package aplicacoes;

import entidades.HerancaContaBancaria;
import entidades.HerancaContaBancariaEmpresa;
import entidades.HerancaContaPoupanca;

public class SobreposicaoSuperOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HerancaContaBancaria conta1 = new HerancaContaBancaria(1000, "joao", 1000D);
		conta1.saque(200D);
		System.out.println(conta1.getSaldo());
		
		// Testando sobreposicao do metodo saque
		HerancaContaPoupanca conta2 = new HerancaContaPoupanca(2000, "mane", 1000D, 5D);
		conta2.saque(200D);
		System.out.println(conta2.getSaldo());
		
		// Testando sobreposicao do metodo saque com uso da palavra super para chamar o metodo da classe pai
		HerancaContaBancariaEmpresa conta3 = new HerancaContaBancariaEmpresa(4000, "ana", 1000D, 2000D);
		conta3.saque(200D);
		System.out.println(conta3.getSaldo());
		
	}

}
