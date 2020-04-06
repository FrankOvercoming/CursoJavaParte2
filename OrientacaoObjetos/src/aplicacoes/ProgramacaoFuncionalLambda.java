package aplicacoes;

import java.util.Arrays;
import java.util.Date;



public class ProgramacaoFuncionalLambda {

	public static int valorGlobal = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] var = { 1, 2, 5, 6, 8, 9 };
		viraPar(var);
		System.out.println(Arrays.toString(var));
		// Transforma um array numa string
		// Arrays classe que trabalhar com arrays
		// Regra para Arrays
		
		// Abaixo um teste de performance para for
		// Regra para tempo de processamento
		// Regra para calculo de tempo de processo
		// Regra para calcular tempo de processamento
		int[] vetor = new int[1000000];
		for (int i = 0 ; i < 1000000; i++) {
			vetor[i] = i + 1;
			
		}

		
		System.out.println(somaVetor(vetor));
	}

	public static long somaVetor(int[] vetor) {
		long inicio;

		long fim;
		long valor = 0;
		inicio = System.nanoTime();
		for (int i = 0; i < vetor.length; i++) {
			
			valor = valor + vetor[i];
			
		}
		
		fim = (System.nanoTime() - inicio) / 1000000;
		System.out.println("Valor em milissegundos execução 1: " + fim);
		System.out.println("Valor 1: " + valor);
		
		valor = 0;
		inicio = System.nanoTime();
		for (int i = 0; i < vetor.length ; i = i + 5 ) {
			
			valor = valor + vetor[i];
			valor = valor + vetor[i+1];
			valor = valor + vetor[i+2];
			valor = valor + vetor[i+3];
			valor = valor + vetor[i+4];
			
			
		}
		fim = (System.nanoTime() - inicio) / 1000000;
		System.out.println("Valor em milissegundos execução 2: " + fim);
		System.out.println("Valor 2: " + valor);
		
		return valor;
		
	}
	
	public static void viraPar(int var[]) {
	
		for (int i = 0; i < var.length; i++) {
			if (var[i] % 2 != 0) {
				var[i] += valorGlobal;
			}
		}
		
		// Esta função usa uma variavel externa a ela a valorGlobal e por isso o
		// resultado da saida da função pode mudar se a variavel valorGlobal mudar, 
		// logo ela não tem transparencia referencial, ela se torna mais dificil de entender 
		// do que uma função que dependesse exclusivamente dos valores dela
		// Transparencia referencial é quando o resultado da função depende exclusivamente
		// dos valores de entrada
		// Regra para função
		// Regra para funcoes
		// Regra para funcao
		// Regra para teoria de funcao
		// Regra para teoria de funcoes

	}
}
