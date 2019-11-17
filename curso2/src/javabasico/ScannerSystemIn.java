package javabasico;

import java.util.Scanner;

public class ScannerSystemIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entrada de dados pelo console
		Scanner sc = new Scanner(System.in);
		String words;
		String palavra1, palavra2, palavra3;
		//**************** Colocar nextLine() depois de usar next() ou nextInt, nextDouble, next[QualquerCoisa]
		//**************** menos quando for nextLine(), porque quando da enter o proximo valor se for nextLine()
		//**************** fica em branco
		
		// esse comando next pode verificar se tem 
		// 3 palavras que podem ser separas por espaço ou enter
		// então ou vc digita 3 palavras separadas por espaço e da enter
		// ou vc digita uma palavra da enter e depois a outra palavra e da enter
		// até completar 3 palavras
		palavra1 = sc.next();
		palavra2 = sc.next();
		palavra3 = sc.next();
		
		System.out.printf("Palavra 1:%s, 2:%s, 3%s", palavra1, palavra2, palavra3);
		// nestline espera uma frase ou palavra no console e depois do enter coloca na variavel
		//words = sc.nextLine();
		//System.out.println(words);
		
		//*********************************
	}

}
