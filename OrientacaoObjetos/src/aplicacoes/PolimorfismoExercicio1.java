package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.PolimorfismoEmpregado;
import entidades.PolimorfismoEmpregadoTerceirizado;

public class PolimorfismoExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String saida = "s";
		String nome;
		Double valorPorHora;
		Integer horas;
		String terceirizado;
		List<PolimorfismoEmpregado> lista = new ArrayList<>();
		while ( saida.equals("s") | saida.equals("S")) {
			System.out.println("Informe nome do empregado: ");
			nome = sc.nextLine();
			System.out.println("Informe quantidade de horas trabalhadas: ");
			horas = sc.nextInt();
			System.out.println("Informe valor por hora: ");
			valorPorHora = sc.nextDouble();
			sc.nextLine();
			System.out.println("Empregado terceirizado (S/N)");
			terceirizado = sc.nextLine();
			PolimorfismoEmpregado empregado;
			if (terceirizado.equals("S") | terceirizado.equals("s")) {
				empregado = new PolimorfismoEmpregadoTerceirizado(nome, horas, valorPorHora );
			} else {
				empregado = new PolimorfismoEmpregado(nome, horas, valorPorHora );
			}
			lista.add(empregado);
			System.out.println("Continuar (S/N)");
			saida = sc.nextLine();
		}
		for(PolimorfismoEmpregado empregado: lista) {
			empregado.pagamento();
			System.out.println(empregado);
		}
		
	}

}
