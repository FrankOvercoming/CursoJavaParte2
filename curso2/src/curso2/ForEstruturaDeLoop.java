package curso2;

import java.util.Scanner;

public class ForEstruturaDeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroLoops = 0;
		int saidaTotal = 0;
		System.out.println("How many numbers do you want ?: ");
		numeroLoops = sc.nextInt();
		if (numeroLoops < 1) 
			System.exit(0);
		int numeros[] = new int[numeroLoops];
		for (int contagem = 0; contagem < numeroLoops; contagem++) {
			sc.nextLine();
			System.out.println("Entre o numero " + (contagem + 1) + " da lista de numeros: " );
			numeros[contagem] = sc.nextInt();
		}
		for (int contagem = 0; contagem < numeros.length ; contagem++) {
			saidaTotal = saidaTotal + numeros[contagem];
		}
		System.out.println("Soma total dos numeros inseridos: " + saidaTotal);
	}

}
