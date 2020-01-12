package curso1;

import java.util.Locale;

import java.util.Scanner;
import com.sun.tools.javac.util.Convert;

public class FormatacaoPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		double b;
		int c;
		double d;
		String numero = "2.5";
		char genero =  'M';
		int idade = 40;
		double balance = 45.9098989;
		String name = "Jose";
		
		
		a = (int) Double.parseDouble(numero);
		b = 2;
		c = (int) a;
		int calculo = 5+1*2;
		int calculo2 = (5+1)*2;
		double calculo3 = 10/7;
		double raizQuadrada = Math.sqrt(16);
		//Declaracoes multiplas na mesma linha
		int a1 = 1, b1 = -4, c1 = 5;
		String teste = "oi", teste2 = "oi2", teste3 = "oi3";
		
		//Operadores atribuição
		a1 += 5;
		b1 *= -1;
		teste += "oi";
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A1: " + a1);
		System.out.println("B1: " + b1);
		System.out.println("C1: " + ++c1);
		System.out.println("teste: " + teste);
		System.out.println("teste2: " + teste2);
		System.out.println("teste3: " + teste3);
		
		d =  a / (double) b;
		System.out.println("Calculo: " + calculo);
		System.out.println("Calculo2: " + calculo2); 
		System.out.println("Calculo3: " + calculo3);
		System.out.println("Raiz quadrada: " + raizQuadrada);
		// Termina o programa java
		// Regra para terminar programa
		System.exit(0);
		System.out.println(b);
		System.out.println("Valor c: " + c);
		System.out.println("Valor d: " + d);
		System.out.print("Sem enter");
		System.out.println("Olha ai");
		// Printf print formatado
		// %.2f = 2 casas decimais ou 2 casas ponto flutuante
		// Regra para formatar saida de casas decimais
		// Regra para printf
		System.out.printf("%.2f%n", balance);
		// Quebra de linha %n ou \n
		// Regra para quebra de linha
		// Regra para printf
		System.out.printf("%.4f\n", balance);
		// Mudando caracterista de ponto flutuante para formatação , ou . conforme país
		// Regra para mudar ponto flutuante de virgula para ponto conforme país
		// Regra para Locale
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", balance);
		// Formatando printf para exibir conforme variáveis
		// Vai exibir string e numero, para string usar %s e para numero %d
		// Regra para printf
		System.out.printf("%s is %d years old", name, idade);
		
	}

}
