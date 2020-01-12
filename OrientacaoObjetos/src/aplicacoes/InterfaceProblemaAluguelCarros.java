package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.InterfaceAluguelDeCarros;
import entidades.InterfaceVeiculo;
import entidades.MetodosAbstratosForma;
import model.services.InterfaceAluguelServico;
import model.services.InterfaceBrasilImpostosServico;

public class InterfaceProblemaAluguelCarros {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Set local
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.println("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.println("Data e Hora de Retirada: (DD/MM/YYYY HH:MM)");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.println("Data e Hora de Devolução: (DD/MM/YYYY HH:MM)");
		Date fim = sdf.parse(sc.nextLine());
		
		InterfaceAluguelDeCarros aluguelCarro = new InterfaceAluguelDeCarros(inicio, fim, 
				new InterfaceVeiculo(modeloCarro));
		
		System.out.println("Informe preço por hora: ");
		Double precoHora = sc.nextDouble();
		System.out.println("Informe preço por dia: ");
		Double precoDia = sc.nextDouble();
		
		InterfaceAluguelServico servicoAluguel = new InterfaceAluguelServico(precoDia, precoHora,
				new InterfaceBrasilImpostosServico());
		
		servicoAluguel.processaNota(aluguelCarro);
		
		System.out.println("Nota: ");
		// Formata saida de numeros para duas casas decimais %.2f
		System.out.println("Pagamento base: " + String.format("%.2f", aluguelCarro.getNota().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", aluguelCarro.getNota().getTaxa() ));
		System.out.println("Pagamento total: " + String.format("%.2f", aluguelCarro.getNota().pagamentoTotal()  ));
		
		
	}

}
