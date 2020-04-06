package aplicacoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericsTipoCuringaDelimitadoCopiaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listaInt =  Arrays.asList(1, 5,45, 1000);
		List<Double> listaDou = Arrays.asList(11.1,233.56, 1.7);
		List<Object> listaObj = new ArrayList<Object>();
		// Regra para Lista Object
		// Regra para Criar Lista de Object
		
		List<? super Number> list2 = new ArrayList<>();
		// Aqui foi mudado de Integer para ? super Number assim esta lista
		// aceita receber dados
		// Regra para Generics Tipo Curinga Delimitado
		
		copiaLista(listaInt,listaObj);
		System.out.println(listaObj);
		imprimeLista(listaObj, true);
		copiaLista(listaDou, list2);
		imprimeLista(list2, true);

	}
	
	public static void copiaLista(List<? extends Number> listaOrigem, List<? super Number> listaDestino) {
		
		// Só posso adicionar na listaDestino porque está como ? super Number
		// se estivesse como ? extends Number, não deixa adicionar, mas deixa pegar os dados
		
		listaDestino.addAll(listaOrigem);
		// Copiar lista para outra lista
		// Regra para lista
		// Regra para List
		
		// A listaOrigem é um caso de covariancia e a listaDestino é um caso de contravariancia
		// Regra para Generics Tipo Curinga Delimitado
		// Regra para Covariancia
		// Regra para Contravariancia
		
	}
	
	public static void imprimeLista(List<?> listaAImprimir, boolean tipoDosItens) {
		if (listaAImprimir.isEmpty() ) {
			return;
		}
		System.out.print("(");
		String saida = "";
		saida = (tipoDosItens) ? "(" + listaAImprimir.get(0).getClass().getSimpleName() + ")" : "" ;
		System.out.print(listaAImprimir.get(0) + saida);
		for(int i = 1; i < listaAImprimir.size(); i++) {
			saida = (tipoDosItens) ? "(" + listaAImprimir.get(i).getClass().getSimpleName() + ")" : "" ;
			System.out.print("; " + listaAImprimir.get(i) + saida);
		}
		System.out.println(")");
		// Imprime lista de qualquer objeto
		// Regra para Lista
		// Regra para imprimir lista
	}

}
