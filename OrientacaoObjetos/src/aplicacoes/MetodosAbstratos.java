package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.*;
import entidades.enums.Cores;
import frameworkking.Numeros;

public class MetodosAbstratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<MetodosAbstratosForma> lista = new ArrayList<>();
		System.out.println("Saida formato: " + Numeros.NumeroTruncaDecimais("10.2345", 2) );
		System.out.println("Entre o numero de formas: ");
		char forma = 'a';
		Cores cor;
		int qtdFormas = sc.nextInt();
		for(int i = 0; i < qtdFormas; i++) {
			System.out.println("Forma #" + (i+1) + " dados:" );
			System.out.println("Retangulo ou Circulo ? (R/C)");
			forma = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Cor (Black, Blue, Red)");
			cor = Cores.valueOf(sc.nextLine());
			if (forma == 'r' | forma == 'R' ) {
				System.out.println("Informa a altura do retangulo: ");
				Double altura = sc.nextDouble();
				System.out.println("Informe a largura do retangulo: ");
				lista.add(new MetodosAbstratosRetangulo(cor, altura, sc.nextDouble() ));
			} else {
				System.out.println("Informe o raio do circulo: ");
				lista.add(new MetodosAbstratosCirculo(cor, sc.nextDouble()));
			}
	
		}
		
		System.out.println("Area das formas: ");
		for( MetodosAbstratosForma formas : lista) {
			System.out.println(formas.getClass().getName() + " Area: " + formas.area());
		}
		
	}

}
