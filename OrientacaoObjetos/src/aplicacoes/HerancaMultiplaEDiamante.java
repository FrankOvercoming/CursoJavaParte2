package aplicacoes;

import entidades.HerancaMultiplaEDiamanteImpressora;
import entidades.HerancaMultiplaEDiamanteScanner;

public class HerancaMultiplaEDiamante {

	public static void main(String[] args) {
		
		HerancaMultiplaEDiamanteImpressora impressora = new HerancaMultiplaEDiamanteImpressora("1000");
		impressora.processaDocumento("Minha carta");
		impressora.imprimir("Minha carta");
		
		HerancaMultiplaEDiamanteScanner scanner = new HerancaMultiplaEDiamanteScanner("2000");
		scanner.processaDocumento("Documento scanner");
		scanner.scannear();
		
	}
}
