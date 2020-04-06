package entidades;

public abstract class HerancaMultiplaEDiamanteDispositivo {
	
	public String numeroSerial;
	// Esta classe ser� usada para mostrar o porque n�o pode haver multiplas heran�as
	// por causa do problema do diamante onde uma classe herdaria de 2 classes que possuem
	// um metodo com assinatura igual que est� sendo usado polimorfismo neles
	// o compilador n�o teria como saber qual dos metodos a classe que herda as 2 classes
	// deveria usar
	
	// Esta classe tamb�m � criada para que os metodos e vari�veis
	// que s�o comuns aos dispositivos como por exemplo o metodo
	// processaDocumento(String documento) possam ser reutilizados
	// os metodos default das interfaces em java 8 podem substituir em alguns 
	// casos as classes abstratas
	// pelas classes que herdam esta classe
	// Regra para Interface
	// Regra para Heran�a multipla
	// Regra para metodo default interface
	
	
	private String documento;
	
	public HerancaMultiplaEDiamanteDispositivo(String numeroSerial) {
		this.numeroSerial = numeroSerial;
		
	}

	public String getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	
	public String getDocumento() {
		return this.documento;
	}
	
	public void setDocument(String documento) {
		this.documento = documento;
	}
	
	public abstract void processaDocumento(String documento);
	

}
