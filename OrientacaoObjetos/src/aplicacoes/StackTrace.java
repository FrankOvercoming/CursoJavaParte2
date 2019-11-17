package aplicacoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++ Inicio metodo 1 +++++++++++++++++");
		metodo1();
		System.out.println("++++++++++++ Fim metodo 1 ++++++++++++++++++");
	}
	
	public static void metodo1() {
		metodo2();
	}

	public static void metodo2() {
		System.out.println("********* Inicio metodo 2 ***************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma frase para separar por espaços");
		try {
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Numero da palavra a pegar da frase: ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao -1]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Posição escolhida não existe");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Informe uma posição numérica a pegar");
			e.printStackTrace();
		}
		System.out.println("********* Fim metodo 2 *******************");
		
	}
}
