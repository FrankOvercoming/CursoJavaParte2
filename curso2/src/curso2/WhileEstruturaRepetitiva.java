package curso2;

import java.io.IOException;
import java.util.Scanner;

public class WhileEstruturaRepetitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		//double raizQuadrada = 0;
		String saida;
		
		while ( numero > -1) {
			//limpaTela();
			System.out.println("Informe um numero: ");
			numero = sc.nextInt();
			saida = (numero > -1) ?  String.format("%.2f",  Math.sqrt((double) numero)) : "Numero negativo";
			System.out.printf("Raiz quadrada deste numero é: " + saida + " %n");
			
		}
	}
	public static void limpaTela() {
		String ESC = "\033[";
		System.out.print(ESC); 
		
//		try {
//			Runtime.getRuntime().exec("cls");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
