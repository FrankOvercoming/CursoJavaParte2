package aplicacoes;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe tamanho da matriz");
		Scanner sc = new Scanner(System.in);
		int matriz = sc.nextInt();
		int[][] mat = new int[matriz][matriz];
		String diagonais = "";
		int negativos = 0;
		int diagonal = 0;
		System.out.println("Tamanho matriz: " + mat[0].length);
		System.out.println("Preencha com os numeros da matriz");
		for(int i=0; i < mat.length; i++) {
			for(int z=0; z < mat[i].length;z++) {
				System.out.println("Informe um numero para linha: " + i + " Coluna: " + z);
				mat[i][z] = sc.nextInt();
				if (mat[i][z] < 0) {
					negativos++;
				}
			}
			diagonais = diagonais + (diagonais.length() > 0 ? ", " : "") + mat[i][diagonal++];
		}
		imprimeMatriz(mat);
		System.out.println("Diagonais: " + diagonais);
		System.out.println("Total de numeros negativos: " + negativos);
	}

	static public void imprimeMatriz(int[][] matrizImprimir) {
		for(int i=0; i < matrizImprimir.length; i++) {
			for(int z=0; z < matrizImprimir[i].length;z++) {
				System.out.printf(" " + matrizImprimir[i][z]);
			}
			System.out.println("");
		}
	}
	
}
