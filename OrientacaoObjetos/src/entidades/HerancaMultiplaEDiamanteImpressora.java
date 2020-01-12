package entidades;

public class HerancaMultiplaEDiamanteImpressora extends HerancaMultiplaEDiamanteDispositivo 
 			 implements HerancaMultiplaEDiamanteImpressoraInterface {

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
