package aplicacoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma frase para separar por espa�os");
		try {
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Numero da palavra a pegar da frase: ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao -1]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Posi��o escolhida n�o existe");
		}
		catch(InputMismatchException e) {
			System.out.println("Informe uma posi��o num�rica a pegar");
		}
	}


}
