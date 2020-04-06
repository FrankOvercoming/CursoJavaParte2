package aplicacoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

import entidades.GenericsImpressaoServicoComGenerics;

public class GenericsImprimeListaSemGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Generics serve para parametrizar classes, interfaces e métodos
		// beneficios são
		// reuso
		// Type Safety
		// Performance
		// Regra para generics
		List<Integer> numeros = Arrays.asList(10,8,20,30);
		
		GenericsImpressaoServicoComGenerics imprime = new GenericsImpressaoServicoComGenerics();
		imprime.adicionaValor(10);
		imprime.adicionaValor(20);
		imprime.adicionaValor(8);
		
	
		try {
			imprime.imprimir();
			System.out.println("Primeiro valor: " + imprime.primeiroValor());
			
		} catch (InvalidAttributeValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
