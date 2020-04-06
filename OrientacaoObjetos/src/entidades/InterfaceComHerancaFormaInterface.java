package entidades;

public interface InterfaceComHerancaFormaInterface {
	
	// Não precisa colocar public abstract porque toda função dentro de uma interface
	// ja é public e abstract - Regra para Interface
	// Interface só tem a assinatura de métodos mais nada, não tem variável nem nada
	// Regra para Interface
	
	// Interface é usada para criar sistemas com baixo acoplamento, isto é, a classe
	// precisa ser modificada se estiver usando uma associação de objetos, tiver um objeto
	// dentro dela que é de outra classe, ao passo que se usada a interface nós criamos
	// um objeto que implementa a interface e nesta classe principal colocamos um objeto
	//  que aponte para a interface, assim se quisermos criar um objeto novo, criamos
	// e fazemos ele implementar a interface que está adicionada na classe principal
	// e depois adicionamos ele
	// Regra para Interface
	public abstract Double area();
}
