package entidades;

public class HerancaMultiplaEDiamanteScanner extends HerancaMultiplaEDiamanteDispositivo 
			 implements HerancaMultiplaEDiamanteScannerInterface {

	public HerancaMultiplaEDiamanteScanner(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processaDocumento(String documento) {
		// TODO Auto-generated method stub
		super.setDocument(documento);
		System.out.println("Scanneando documento: " + documento);
	}

	// @Override usado para apontar para o compilador que esta fun��o est� sobreescrevendo
	// uma fun��o de uma classe m�e, ou para implementar metodo de uma interface
	// Regra para sobreescrita - Regra para sobre escrita
	@Override
	public void scannear() {
		System.out.println("Conteudo scanneado: " + super.getDocumento() );
	}


	
}
