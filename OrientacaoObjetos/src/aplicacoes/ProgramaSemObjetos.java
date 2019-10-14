package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSemObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		double xA, xB, xC;
		double yA, yB, yC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os lados do triangulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Informe os lados do triangulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = ( xA + xB + xC ) / 2;
		double areaX = Math.sqrt(p * ( p - xA ) * ( p - xB) * ( p -xC )  );
		
		p = ( yA + yB + yC ) / 2;
		double areaY = Math.sqrt(p * ( p - yA ) * ( p - yB) * ( p -yC )  );

		System.out.printf("Area do triangulo X é: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y é: %.4f%n", areaY);
		
		String trianguloMaior = (areaX > areaY) ? "X" : "Y";
		System.out.println("O triangulo " + trianguloMaior + " é o maior triangulo");
		
	}

}
