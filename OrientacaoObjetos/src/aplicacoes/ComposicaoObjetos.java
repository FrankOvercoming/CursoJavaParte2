package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import entidades.ContratoPorHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class ComposicaoObjetos {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// SimpleDateFormat pode ser instanciado como static no inicio da classe
		// assim ele não será criado um novo para cada objeto pois static pertence a classe
		SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat mesAno = new SimpleDateFormat("MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o nome do departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Entre o nome do trabalhador: ");
		String nome = sc.nextLine();
		System.out.println("Entre com o nivel do trabalhador: ");
		String nivel = sc.nextLine();
		System.out.println("Entre com o salario base do trabalhador: ");
		Double salarioBase = sc.nextDouble();
		NivelTrabalhador nivelTrab = NivelTrabalhador.valueOf(nivel);
		Departamento departamento = new Departamento(departamentoNome);
		Trabalhador trabalhador = new Trabalhador(nome, nivelTrab , salarioBase, departamento);
		System.out.println("Quantidade de contratos do trabalhador: ");
		int qtdContratos = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < qtdContratos; x++) {
			ContratoPorHora contratoHora = new ContratoPorHora();
			System.out.println("Informe a data do contrato: ");
			contratoHora.setDataContrato(dataFormato.parse(sc.nextLine()));
			System.out.println("Valor por hora do contrato: ");
			contratoHora.setValorPorHora(sc.nextDouble());
			System.out.println("Quantidade de horas do contrato: ");
			contratoHora.setQtdHoras(sc.nextInt());
			trabalhador.adicionaContrato(contratoHora);
			sc.nextLine();
		}
		System.out.println("Informe mes e ano dos contratos a somar: ");
		Date dataMesAno = mesAno.parse(sc.nextLine());
		Calendar mesAnoCal = Calendar.getInstance();
		mesAnoCal.setTime(dataMesAno);
		System.out.println("Nome do trabalhador: " + trabalhador.getNome() );
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNomeDepartamento() );
		System.out.println("Total dos contratos em : " + mesAno.format(dataMesAno) + ": " + 
		trabalhador.ganho(mesAnoCal.get(Calendar.YEAR), mesAnoCal.get(Calendar.MONTH)));
		
		
		sc.close();
	}

}
