package javabasico;

import java.util.Locale;
import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String teste = sc.nextLine();
		int numero;
		double fluto;
		fluto = sc.nextDouble();
		numero = Integer.parseInt(teste.substring(1));
		String nome = sc.next();
		int idade = sc.nextInt();
		char genero = sc.next().charAt(0);
		
		System.out.println("Saida: " + teste);
		System.out.println("Numero: " + numero);
		System.out.println("Double: " + fluto);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		sc.close();
	}

}
