package curso2;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saida;
		int saidaNumero;
		Scanner sc = new Scanner(System.in);
		char genero;
		
		saidaNumero = sc.nextInt(); // Pega um numero no console
		sc.nextLine(); // Este nextLine sem atribuição limpa o buffer porque
		// se colocar numa variavel sem chamar o buffer fica com o enter do nextInt
		// anterior e não deixa o console aberto para receber dados novos
		saida = sc.nextLine(); // Pega uma string no console
		// pega o char na posicao 0 e retorna como tipo char e não como string
		genero = sc.nextLine().charAt(0); // Pega um char
		
		
		System.out.println("Saida: " + saida);
		System.out.println("saidaNumero: " + saidaNumero);
		System.out.println("Genero: " + genero);
		
		sc.close();
		
	}

}
