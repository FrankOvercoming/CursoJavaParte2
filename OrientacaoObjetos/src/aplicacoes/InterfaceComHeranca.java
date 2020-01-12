package aplicacoes;

import entidades.InterfaceComHerancaCirculo;
import entidades.InterfaceComHerancaFormaAbstrata;
import entidades.InterfaceComHerancaRetangulo;
import entidades.enums.InterfaceComHerancaCor;

public class InterfaceComHeranca {

	public static void main(String[] args) {
		
		
		// Neste caso estamos usando polimorfismo pois estamos criando duas vari�veis iguais
		// mas que est�o sendo instanciadas com seus respectivos filhos que por
		// sua vez tem fun��es com a mesma assinatura mas d�o resultados diferentes
		// aqui n�o estamos instanciando uma classe abstrata pois a classe abstrata
		// InterfaceComHerancaForma n�o est� sendo instanciada e sim suas classes
		// que herdam ela, isto � usado no polimorfismo
		InterfaceComHerancaFormaAbstrata forma1 = new InterfaceComHerancaCirculo(InterfaceComHerancaCor.BRANCO
				, 2.0);
		InterfaceComHerancaFormaAbstrata forma2 = new InterfaceComHerancaRetangulo(
				InterfaceComHerancaCor.AMARELO , 3.0, 2.0);
		
		System.out.println("Cor do circulo: " + forma1.getCor() );
		System.out.println("Area do circulo: " + forma1.area() );
		System.out.println("Cor do retangulo: " + forma2.getCor() );
		System.out.println("Area do retangulo: " + forma2.area() );
		
	}
	
}
