package entidades;

public class HerancaMultiplaEDiamanteDispositivoComboMultiplaHeranca { //extends
		// HerancaMultiplaEDiamanteScanner extends HerancaMultiplaEDiamanteImpressora {

	// Este � o problema do diamante, n�o posso herdar de duas classes ao mesmo tempo
	// ent�o eu n�o poderia ter um dispositivo multifuncional como uma impressora e scanner
	// pois n�o posso herdar de duas classes ao mesmo tempo
	// A solu��o ser� criar interfaces, neste caso ser� criada uma interface Impressora
	// e uma interface Scanner, que ir� conter os metodos especificos de cada dispositivo
	// para serem implementados, na classe impressora o metodo imprimir e na classe
	// scanner o metodo scannear.
	// Ent�o as classes HerancaMultiplaEDiamanteImpressora e HerancaMultiplaEDiamanteScanner
	// passar�o a implementar suas interfaces HerancaMultiplaEDiamanteImpressoraInterface e
	// HerancaMultiplaEDiamanteScannerInterface e depois criaremos um dispositivo combo
	// que herdar� de HerancaMultiplaEDiamanteDispositivo e implementar� as duas interfaces
	// HerancaMultiplaEDiamanteImpressoraInterface e HerancaMultiplaEDiamanteScannerInterface
	// Assim poder� usufruir do polimorfismo
	// Regra para Heranca Multipla
	// Regra para Diamante
	public HerancaMultiplaEDiamanteDispositivoComboMultiplaHeranca (String numeroSerial) {
		//super(numeroSerial);
	}
	
}
