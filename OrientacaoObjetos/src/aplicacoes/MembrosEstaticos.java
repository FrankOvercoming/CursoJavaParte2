package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;

public class MembrosEstaticos {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o raio do circulo: ");
		double raio = sc.nextDouble();
		
		double diametro = raio * 2;
		double circunferencia = Circulo.circunferencia(raio);
		double area = Circulo.area(raio);
		double volume = Circulo.volumeEsfera(raio);
		
		System.out.println("Diametro do circulo: " + diametro);
		System.out.println("Circunferencia do circulo: " + circunferencia);
		System.out.println("Area do circulo: " + area);
		System.out.println("Volume da esfera do circulo: " + volume);
		
	}
}
