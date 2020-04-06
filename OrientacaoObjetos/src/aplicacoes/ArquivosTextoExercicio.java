package aplicacoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.ProdutoConstrutor;

public class ArquivosTextoExercicio {
	// Esta classe importa um arquivo do tipo csv, que é um arquivo texto separado por 
	// virgulas e cria outro arquivo, isto é, exporta em formato csv também
	// Regra para arquivo texto
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		String path = "C:\\temp\\lista.csv";
		// Conteudo do arquivo lista.csv
		//		TV led,1300.29,1
		//		Radio,320.67,2
		//		geladeira,900.12,6
		//		maquina de lavar, 124.45,3
		//		IcocoPhone, 56.38,7
		
		ProdutoConstrutor prod = null;
		List<ProdutoConstrutor> lista = new ArrayList<>();
		File arq = new File(path);
		
		boolean criado = new File(arq.getParent() + "\\out").mkdir();
		try (
				FileReader fr = new FileReader(arq);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(arq.getParent() + "\\out\\sumary.csv");
				BufferedWriter bw = new BufferedWriter(fw);
				
				){
			String linha = br.readLine();
			String[] virgs = null;
			while (linha != null) {
				virgs = linha.split(",");
				// Usando classe produto para facilitar e organizar a importacao
				prod = new ProdutoConstrutor();
				prod.nome = virgs[0];
				prod.preco = Double.parseDouble(virgs[1]);
				prod.quantidade = Integer.parseInt( virgs[2]);
				lista.add(prod); // adicionado na lista só para usar lista do nada, sem necessidade
				System.out.println(prod);
				bw.write(prod.nome + "," + prod.valorTotalDosProdutos());
				bw.newLine();
				linha = br.readLine();
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
