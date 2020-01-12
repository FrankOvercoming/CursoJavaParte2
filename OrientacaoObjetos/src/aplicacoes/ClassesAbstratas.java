package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.*;
// Esta classe demonstra o uso de classes abstratas em relação ao polimorfismo
// pois a Classe ClassesAbstratasContaPoupança foi declarada como abstrata, então só podemos instanciar
// suas classes filhas, porem podemos usa-la como coleção como no caso do list<>, podendo assim
// aproveitar o polimorfismo da função getSaldo() e reutilização de codigo com a função deposito();
// pois não precisamos escrever uma função deposito para cada classe, elas usaram a função da classe abstrata
// Regra para polimorfismo
public class ClassesAbstratas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Esta classe não pode ser instanciada porque ela foi declarada como abstrata
		// ela deve ser herdada e seus herdeiros então que devem ser instanciados
		// ClassesAbstratasContaBancaria conta = new ClassesAbstratasContaBancaria();

		Locale.setDefault(Locale.US); // muda a saida decimal para ponto mesmo estando com a maquina usando virgula
		List<ClassesAbstratasContaBancaria> lista = new ArrayList<>();
		lista.add(new ClassesAbstratasContaPoupanca(1000, "Joao", 100D, 10.0 ));
		lista.add(new ClassesAbstratasContaBancariaEmpresa(2000, "bob", 200D, 100.0));
		lista.add(new ClassesAbstratasContaPoupanca(1500, "mane", 140D, 15.0 ));
		lista.add(new ClassesAbstratasContaBancariaEmpresa(3000, "alex", 2000D, 1000.0));
		
		Double soma = 0.0;
		for(ClassesAbstratasContaBancaria conta: lista) {
			soma += conta.getSaldo();
		}
		
		System.out.printf("Total de todas as contas: %.2f%n", soma);
		
		for(ClassesAbstratasContaBancaria conta: lista) {
			conta.deposito(10D);
		}
		for(ClassesAbstratasContaBancaria conta: lista) {
			System.out.printf("Saldo da conta %d atualizado para: %.2f %n", conta.getNumeroConta(),conta.getSaldo());
		}
		
		
	}

}
