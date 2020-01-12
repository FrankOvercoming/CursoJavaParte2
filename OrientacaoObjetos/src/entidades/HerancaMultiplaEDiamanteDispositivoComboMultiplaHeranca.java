package entidades;

public class HerancaMultiplaEDiamanteDispositivoComboMultiplaHeranca { //extends
		// HerancaMultiplaEDiamanteScanner extends HerancaMultiplaEDiamanteImpressora {

	// Este é o problema do diamante, não posso herdar de duas classes ao mesmo tempo
	// então eu não poderia ter um dispositivo multifuncional como uma impressora e scanner
	// pois não posso herdar de duas classes ao mesmo tempo
	// A solução será criar interfaces, neste caso será criada uma interface Impressora
	// e uma interface Scanner, que irá conter os metodos especificos de cada dispositivo
	// para serem implementados, na classe impressora o metodo imprimir e na classe
	// scanner o metodo scannear.
	// Então as classes HerancaMultiplaEDiamanteImpressora e HerancaMultiplaEDiamanteScanner
	// passarão a implementar suas interfaces HerancaMultiplaEDiamanteImpressoraInterface e
	// HerancaMultiplaEDiamanteScannerInterface e depois criaremos um dispositivo combo
	// que herdará de HerancaMultiplaEDiamanteDispositivo e implementará as duas interfaces
	// HerancaMultiplaEDiamanteImpressoraInterface e HerancaMultiplaEDiamanteScannerInterface
	// Assim poderá usufruir do polimorfismo
	// Regra para Heranca Multipla
	// Regra para Diamante
	public HerancaMultiplaEDiamanteDispositivoComboMultiplaHeranca (String numeroSerial) {
		//super(numeroSerial);
	}
	
}
