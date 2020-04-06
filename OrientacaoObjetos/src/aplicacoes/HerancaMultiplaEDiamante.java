package aplicacoes;

import entidades.HerancaMultiplaEDiamanteDispositivoCombo;
import entidades.HerancaMultiplaEDiamanteImpressora;
import entidades.HerancaMultiplaEDiamanteScanner;

public class HerancaMultiplaEDiamante {

	public static void main(String[] args) {
		
		
		// Como ambos os dispositivos usam itens em comum e não posso herdar mais do que uma
		// classe, então fazemos o seguinte, criamos uma classe abstrata que contém metodos
		// em comum a todos os dispositivos e cada classe implementa seus metodos
		// especificos mas herda da classe abstrata os metodos comuns
		// Regra para classe abstrata
		// Regra para herança multipla
		
		HerancaMultiplaEDiamanteImpressora impressora = new HerancaMultiplaEDiamanteImpressora("1000");
		impressora.processaDocumento("Minha carta");
		impressora.imprimir("Minha carta");
		
		HerancaMultiplaEDiamanteScanner scanner = new HerancaMultiplaEDiamanteScanner("2000");
		scanner.processaDocumento("Documento scanner");
		scanner.scannear();
		
		HerancaMultiplaEDiamanteDispositivoCombo combo = new HerancaMultiplaEDiamanteDispositivoCombo("3000");
		combo.processaDocumento("documento trololó");
		combo.scannear();
		combo.imprimir("Documento scrumble ramsters");
		
		
	}
}
