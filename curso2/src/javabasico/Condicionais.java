package javabasico;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um numero para saber se é par ou impar");
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		if ( i % 2 == 0) {
//			System.out.println("Este numero é par");
//		} else {
//			System.out.println("Este numero é impar");
//		}
//		sc.nextLine();
//		
//		String peca = sc.nextLine();
//		if ( peca.toLowerCase().compareTo("vela") == 0) {
//			System.out.println("Peça de motor");
//		} else if ( peca.toLowerCase().compareTo("mola") == 0) {
//			System.out.println("Peça de suspensão");
//		} else if ( peca.toLowerCase().compareTo("trambulador") == 0) {
//			System.out.println("Peça de cambio");
//		}
//		
//		sc.nextLine();
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		String saida = "";
		
		if ((numero1 > numero2) && numero1 > numero3 ) {
			saida = Integer.toString(numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			saida = Integer.toString(numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			saida = Integer.toString(numero3) ;
		}
		System.out.println("O numero: " + saida + " é o maior");
		
	}

}
