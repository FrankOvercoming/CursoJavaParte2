package aplicacoes;

import entidades.InterfaceComHerancaCirculo;
import entidades.InterfaceComHerancaFormaAbstrata;
import entidades.InterfaceComHerancaRetangulo;
import entidades.enums.InterfaceComHerancaCor;

public class InterfaceComHeranca {

	public static void main(String[] args) {
		
		
		// Neste caso estamos usando polimorfismo pois estamos criando duas variáveis iguais
		// mas que estão sendo instanciadas com seus respectivos filhos que por
		// sua vez tem funções com a mesma assinatura mas dão resultados diferentes
		// aqui não estamos instanciando uma classe abstrata pois a classe abstrata
		// InterfaceComHerancaForma não está sendo instanciada e sim suas classes
		// que herdam ela, isto é usado no polimorfismo
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
