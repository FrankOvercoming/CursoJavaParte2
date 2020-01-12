package entidades;

public class HerancaMultiplaEDiamanteDispositivoCombo extends HerancaMultiplaEDiamanteDispositivo
			 implements HerancaMultiplaEDiamanteScannerInterface, HerancaMultiplaEDiamanteImpressoraInterface	{

	public HerancaMultiplaEDiamanteDispositivoCombo(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir(String documento) {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo documento combo: " + documento);
	}

	@Override
	public void scannear() {
		// TODO Auto-generated method stub
		System.out.println("Scanneando documento combo: " + super.getDocumento());
	}

	@Override
	public void processaDocumento(String documento) {
		// TODO Auto-generated method stub
		super.setDocument(documento);
		System.out.println("Processando documento combo: " + documento);
	}

}
