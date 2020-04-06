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
		
		// N�o aceita a lista de circulos porque na fun��o ele apenas aceita um tipo
		// GenericsTipoCuringaDelimitadoInterfaceShape pois esse tipo n�o � um super tipo
		// de GenericsTipoCuringaDelimitadoCirculo logo s� funciona para tipos
		// GenericsTipoCuringaDelimitadoInterfaceShape
		
		// System.out.println("Soma das areas: " + somaAreas(circulos) );
		
		// Regra para Generics Curinga Delimitado
		// Regra para Curinga Generics Delimitado
		
		
		System.out.println("Soma das areas: " + somaAreas(lista) );
		
	}

	public static double somaAreas(List<? extends GenericsTipoCuringaDelimitadoInterfaceShape>  lista ) {
		
		// Se colocarmos somente ? como curinga em vez de usar o GenericsTipoCuringaDelimitadoInterfaceShape
		// o for abaixo daria erro pois n�o necessariamente o objeto que vir� no parametro
		// ser� do tipo GenericsTipoCuringaDelimitadoInterfaceShape pois estaremos usando
		// curinga ?
		// Genericas Curinga Delimitado
		
		// Ent�o usamos o ? extends GenericsTipoCuringaDelimitadoInterfaceShape
		// pois estaremos dizendo que o parametro aceita qualquer tipo que seja um 
		// sub tipo de GenericsTipoCuringaDelimitadoInterfaceShape
		// isto �, pode ser GenericsTipoCuringaDelimitadoInterfaceShape ou qualquer outro
		// objeto que implemente GenericsTipoCuringaDelimitadoInterfaceShape
		// Generics Curinga Delimitado
		
		//  lista.add(new GenericsTipoCuringaDelimitadoRetangulo(2.0, 3.0));
		// n�o podemos adicionar item na lista porque o compilador n�o sabe que tipo 
		// ser� informado para a fun��o, pois o caracter curinga mesmo sendo um sub tipo de
		// GenericsTipoCuringaDelimitadoInterfaceShape n�o necessariamente ser� compat�vel com
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
