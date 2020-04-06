package aplicacoes;

import java.util.ArrayList;
import java.util.List;

import entidades.GenericsTipoCuringaDelimitadoCirculo;
import entidades.GenericsTipoCuringaDelimitadoInterfaceShape;
import entidades.GenericsTipoCuringaDelimitadoRetangulo;

public class GenericsTipoCuringaDelimitado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<GenericsTipoCuringaDelimitadoInterfaceShape> lista = new ArrayList<>();
		lista.add(new GenericsTipoCuringaDelimitadoCirculo(2.0) );
		lista.add(new GenericsTipoCuringaDelimitadoRetangulo(3.0, 4.0) );
		
		List<GenericsTipoCuringaDelimitadoCirculo> circulos = new ArrayList<GenericsTipoCuringaDelimitadoCirculo>();
		circulos.add(new GenericsTipoCuringaDelimitadoCirculo(5.6));
		circulos.add(new GenericsTipoCuringaDelimitadoCirculo(19.1));
		
		// Não aceita a lista de circulos porque na função ele apenas aceita um tipo
		// GenericsTipoCuringaDelimitadoInterfaceShape pois esse tipo não é um super tipo
		// de GenericsTipoCuringaDelimitadoCirculo logo só funciona para tipos
		// GenericsTipoCuringaDelimitadoInterfaceShape
		
		// System.out.println("Soma das areas: " + somaAreas(circulos) );
		
		// Regra para Generics Curinga Delimitado
		// Regra para Curinga Generics Delimitado
		
		
		System.out.println("Soma das areas: " + somaAreas(lista) );
		
	}

	public static double somaAreas(List<? extends GenericsTipoCuringaDelimitadoInterfaceShape>  lista ) {
		
		// Se colocarmos somente ? como curinga em vez de usar o GenericsTipoCuringaDelimitadoInterfaceShape
		// o for abaixo daria erro pois não necessariamente o objeto que virá no parametro
		// será do tipo GenericsTipoCuringaDelimitadoInterfaceShape pois estaremos usando
		// curinga ?
		// Genericas Curinga Delimitado
		
		// Então usamos o ? extends GenericsTipoCuringaDelimitadoInterfaceShape
		// pois estaremos dizendo que o parametro aceita qualquer tipo que seja um 
		// sub tipo de GenericsTipoCuringaDelimitadoInterfaceShape
		// isto é, pode ser GenericsTipoCuringaDelimitadoInterfaceShape ou qualquer outro
		// objeto que implemente GenericsTipoCuringaDelimitadoInterfaceShape
		// Generics Curinga Delimitado
		
		//  lista.add(new GenericsTipoCuringaDelimitadoRetangulo(2.0, 3.0));
		// não podemos adicionar item na lista porque o compilador não sabe que tipo 
		// será informado para a função, pois o caracter curinga mesmo sendo um sub tipo de
		// GenericsTipoCuringaDelimitadoInterfaceShape não necessariamente será compatível com
		// GenericsTipoCuringaDelimitadoRetangulo, pois pode ser um tipo 
		// GenericsTipoCuringaDelimitadoCirculo por exemplo
		// Generics Curringa Delimitado
		
		
		double saida = 0;
		for(GenericsTipoCuringaDelimitadoInterfaceShape item : lista) {
			saida += item.area();
		}
		return saida;
	}
}
