package curso2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char saida;
		Scanner sc = new Scanner(System.in);
		double numeroInformado = 0;
		double raizQuadrada;
		Exception e = null;
		do {
			System.out.println("Informe um numero para saber a raiz quadrada: ");
			numeroInformado = sc.nextDouble();
			raizQuadrada = Math.sqrt(numeroInformado);
			System.out.printf("Raiz quadrada desse numero é %.4f %n", raizQuadrada );
			//sc.nextLine();
			System.out.println("Deseja saber raiz quadrada de mais um numero ?(s/n)");
			saida = sc.next().charAt(0);
		} while (saida != 'n' && saida == 's');

	}

}
