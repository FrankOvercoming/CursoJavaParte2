package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero de alturas: ");
		double[] tamanho = new double[sc.nextInt()];
		double valorTotal = 0;
		for(int i=0; i < tamanho.length; i++) {
			System.out.println("Informe altura: " + (i+1) );
			tamanho[i] = sc.nextDouble();
			valorTotal = valorTotal + tamanho[i];
		}
		System.out.printf("Altura media: %.2f", (valorTotal / tamanho.length));
	}

}
