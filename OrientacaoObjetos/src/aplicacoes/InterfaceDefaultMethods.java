package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterfaceDefaultMethodsBrasilEmprestimoServico;
import model.services.InterfaceDefaultMethodsEUAEmprestimoServico;
import model.services.InterfaceDefaultMethodsEmprestimoServico;

public class InterfaceDefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor para o empréstimo: ");
		Double valor = sc.nextDouble();
		System.out.println("Meses: ");
		Integer meses = sc.nextInt();
		
		InterfaceDefaultMethodsEmprestimoServico ibs = new 
				InterfaceDefaultMethodsEUAEmprestimoServico(1.0);
		
		Double pagamento = ibs.calculaValorEmprestimo(valor, meses);
		// String.format formata valor decimal
		// Regra para formatação decimal
		// Regra para formatar decimal
		// Regra para formatar numeros
		System.out.println("Valor final a pagar somando os " + meses + 
				" mes(es): " + String.format("%.2f", pagamento)  );
		
		sc.close();

	}

}
