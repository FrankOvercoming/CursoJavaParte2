package entidades;

public class HerancaMultiplaEDiamanteImpressora extends HerancaMultiplaEDiamanteDispositivo 
 			 implements HerancaMultiplaEDiamanteImpressoraInterface {

	// Neste caso estamos herdando uma classe abstrata HerancaMultiplaEDiamanteDispositivo
	// para conseguir usar os metodos e variaveis comuns para todas as classes
	// de dispositivos como por exemplo o metodo processaDocumento(String documento)
	// depois implementamos a Interface HerancaMultiplaEDiamanteImpressoraInterface
	// o motivo seria o uso no dispositivo combo que seria uma impressora multifuncional
	// mas não existe reuso pois a classe HerancaMultiplaEDiamanteDispositivoCombo
	// vai implementar a função de imprimir assim como está sendo feito nesta 
	// classe também, por enquanto ficou meio sem sentido criar e implementar
	// essa interface
	// Regra para interface
	// Regra para Herança multipla
	
	
	public HerancaMultiplaEDiamanteImpressora(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processaDocumento(String documento) {
		// TODO Auto-generated method stub
		
		super.setDocument(documento);
		System.out.println("Processa documento da classe Impressora" + documento);
		
	}
	
	public void imprimir(String documento) {
		System.out.println("Imprimindo documento: " + documento);
	}

}
