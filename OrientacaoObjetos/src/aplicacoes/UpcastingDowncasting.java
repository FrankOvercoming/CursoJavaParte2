package aplicacoes;

import entidades.HerancaContaBancaria;
import entidades.HerancaContaBancariaEmpresa;
import entidades.HerancaContaPoupanca;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HerancaContaBancaria conta = new HerancaContaBancaria(2000, "Z� das coves", 150.3);
		HerancaContaBancariaEmpresa contaEmpresa = new HerancaContaBancariaEmpresa(3000, "joelma", 20.6, 5.4);
		
		// UpCasting
		// Nestes dois casos n�o deu erro porque estamos atribuindo uma subClasse a uma Classe, isto � UpCasting
		HerancaContaBancaria contaTeste = contaEmpresa;
		HerancaContaBancaria conta2 = new HerancaContaBancariaEmpresa(4000, "z� do teste", 34.8, 22.3);
		HerancaContaBancaria conta3 = new HerancaContaPoupanca(3455 , "Manuel", 300D, 45.7);
		
		//DownCasting
		HerancaContaBancariaEmpresa conta4 = (HerancaContaBancariaEmpresa) conta2;
		conta4.emprestimo(100D);
		
		// Esta linha n�o da erro em tempo de compila��o, somente em tempo de execu��o
		// Porque eu n�o posso fazer um DownCasting de um objeto que n�o � subclasse da classe que est� sendo instanciada
		// pois conta3 � do tipo poupan�a e n�o empresa
		// HerancaContaBancariaEmpresa conta5 = (HerancaContaBancariaEmpresa) conta3;
		
		if (conta3 instanceof HerancaContaBancariaEmpresa ) {
			HerancaContaBancariaEmpresa conta6 = (HerancaContaBancariaEmpresa) conta3;
			System.out.println("Conta3 � do tipo empresa");
		}
		
		if ( conta2 instanceof HerancaContaBancariaEmpresa) {
			HerancaContaBancariaEmpresa conta7 = (HerancaContaBancariaEmpresa) conta2;
			System.out.println("Conta2 � do tipo empresa, ent�o fazemos Downcasting");
			System.out.println("Limite de emprestimo: " + conta7.getLimiteEmprestimo());
		}
	}

}
