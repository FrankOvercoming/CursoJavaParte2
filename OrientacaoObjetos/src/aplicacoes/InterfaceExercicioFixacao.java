package aplicacoes;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.InterfaceExercicioFixacaoContrato;
import entidades.InterfaceExercicioFixacaoParcelaContrato;
import model.services.InterfaceExercicioFixacaoCalculaParcelaPayPalServico;

public class InterfaceExercicioFixacao {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		List<String> parcelas = new ArrayList<>();
		
		InterfaceExercicioFixacaoContrato contrato = new InterfaceExercicioFixacaoContrato();
		
		System.out.println("Entre os dados do contrato");
		System.out.println("Numero do contrato: ");
		contrato.setNumeroContrato(sc.nextLong());
		System.out.println("Data do contrato (DD/MM/YYYY): ");
		sc.nextLine();
		contrato.setDataContrato(sdf.parse(sc.nextLine()));
		System.out.println("Valor do contrato: ");
		contrato.setValorContrato(sc.nextDouble());
		System.out.println("Numero de parcelas: ");
		contrato.setNumeroParcelas(sc.nextInt());
		InterfaceExercicioFixacaoCalculaParcelaPayPalServico calculaParcelas = 
				new InterfaceExercicioFixacaoCalculaParcelaPayPalServico();
		calculaParcelas.valorparcelado(contrato.getValorContrato(), contrato.getNumeroParcelas());
		contrato.setCalculaParcela(calculaParcelas);
		contrato.geraParcelas();
		for(InterfaceExercicioFixacaoParcelaContrato parcela: contrato.getListaParcelas() ) {
			System.out.println(parcela);
		}
	}
} 
