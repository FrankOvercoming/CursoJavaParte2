package curso2;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroMaior;
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Enter 3 numbers: ");
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		numero3 = sc.nextInt();
		numeroMaior = maxNumber(numero1, numero2, numero3);
		showMaxNumber(numeroMaior);
		
		sc.close();
	}

	public static int maxNumber(int a, int b, int c) {
		int saida;
		if ( a > b && a > c) {
			saida = a;
		} else if (b > c) {
			saida = b;
		} else 
			saida = c;
		
		return saida;
	}
	
	public static void showMaxNumber(int maxNumber) {
		System.out.println("The max number is: " + maxNumber);
	}
}
