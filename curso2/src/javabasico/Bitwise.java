package javabasico;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b = 3;
		// 101 a = 5
		// 011 b = 3
		System.out.println(a & b); // Resultado 1 pois
		// o operador bitwise & é do tipo and 
		// Para colocar como binario usar 0bSequenciaBinaria
		int i = 0b100;
		int f = 0b011;
		int veri = 0b001;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("Valor de i: " + i);
		System.out.println("Valor de f: " + f);
		if ((veri& i) == 1) {
			System.out.println("Para valor de i Primeiro bit ligado");
		} else {
			System.out.println("Para valor de i Primeiro bit desligado");
		}
	}

}
