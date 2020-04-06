package javabasico;

public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		boolean Amaior = a > 10;
		boolean Amenor = a < 10;
		boolean aIgual100 = a == 100;
		boolean aDiferente10 = a != 10;
		
		//Ordem de precedencia
		// ! > && > || quer dizer primeiro executa o "not", depois o "and" e depois o "or"
		// Regra para or
		// Regra para and
		// Regra para not
		// Regra para booleanos
		
		
		System.out.println("A maior que 10: " + Amaior);
		System.out.println("A menor que 10: " + Amenor);
		System.out.println("A igual a 100: " + aIgual100);
		System.out.println("A diferente de 10: " + aDiferente10);
		System.out.println("Booleanos: " + (true || false && false));
	}

}
