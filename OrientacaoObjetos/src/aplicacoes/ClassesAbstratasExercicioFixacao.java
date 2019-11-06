package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.*;

public class ClassesAbstratasExercicioFixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre numero de contribuintes: ");
		List<ClassesAbstratasPessoas> lista = new ArrayList<>();
		int numeroDeImpostores = sc.nextInt();
		char tipoPessoa;
		String nome;
		Double ganhoAnual;
		for( int i = 0; i < numeroDeImpostores; i++) {
			sc.nextLine();
			System.out.println("Contribuinte n# " + (i+1));
			System.out.println("Contribuinte pessoa fisica ou juridica ?(f/j)");
			tipoPessoa = sc.nextLine().charAt(0);
			System.out.println("Nome do contribuinte: ");
			nome = (sc.nextLine());
			System.out.println("Ganho anual: ");
			ganhoAnual = (sc.nextDouble());
			if (tipoPessoa == 'f' | tipoPessoa == 'F') {
				System.out.println("Gastos com saude: ");
				lista.add(new ClassesAbstratasPessoaFisica(nome, ganhoAnual, sc.nextDouble()) );
			} else {
				System.out.println("Quantidade de funcionarios: ");
				lista.add(new ClassesAbstratasPessoaJuridica(nome, ganhoAnual, sc.nextInt()));
			}
		}
		System.out.printf("Impostos pagos: \n");
		Double totalPago = 0.0;
		Double valorImposto = 0.0;
		for(ClassesAbstratasPessoas pessoa : lista ) {
			valorImposto = pessoa.calculoImposto();
			System.out.println(pessoa.getNome() + ": $ " + valorImposto);
			totalPago += valorImposto;
		}
		System.out.println("");
		System.out.println("Total pago de impostos: " + totalPago);
		
	}

}
