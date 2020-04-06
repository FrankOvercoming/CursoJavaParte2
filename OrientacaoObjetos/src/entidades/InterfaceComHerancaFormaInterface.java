package entidades;

public interface InterfaceComHerancaFormaInterface {
	
	// N�o precisa colocar public abstract porque toda fun��o dentro de uma interface
	// ja � public e abstract - Regra para Interface
	// Interface s� tem a assinatura de m�todos mais nada, n�o tem vari�vel nem nada
	// Regra para Interface
	
	// Interface � usada para criar sistemas com baixo acoplamento, isto �, a classe
	// precisa ser modificada se estiver usando uma associa��o de objetos, tiver um objeto
	// dentro dela que � de outra classe, ao passo que se usada a interface n�s criamos
	// um objeto que implementa a interface e nesta classe principal colocamos um objeto
	//  que aponte para a interface, assim se quisermos criar um objeto novo, criamos
	// e fazemos ele implementar a interface que est� adicionada na classe principal
	// e depois adicionamos ele
	// Regra para Interface
	public abstract Double area();
}
