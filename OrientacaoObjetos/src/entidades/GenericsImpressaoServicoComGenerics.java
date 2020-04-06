package entidades;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import javax.management.InvalidAttributeValueException;

public class GenericsImpressaoServicoComGenerics<TipoGenerico> {
	
	// Agora a classe pode aceitar qualquer tipo de variável
	// Essa classe agora usa generics e o TipoGenerico aceita qualquer tipo variavel
	// Regra para generics
	
	
	private List<TipoGenerico> lista = new ArrayList<>();
	

	public void setLista(List<TipoGenerico> lista) {
		this.lista = lista;
	}

	public void adicionaValor(TipoGenerico valor) {
		
		lista.add(valor);
		
	}

	public TipoGenerico primeiroValor() throws InvalidAttributeValueException {
		
		if (lista.isEmpty() || lista == null) {
			
			throw new InvalidParameterException("A lista não contém dados !!");
		}
		
		return lista.get(0);
	}
	
	public void imprimir() {
		
		if (lista.isEmpty() || lista == null) {
			throw new InvalidParameterException("A lista não contém dados !!");
		}
		String saida = "";
		saida += ("[");

		for ( TipoGenerico numero : lista) {
				
				saida += (numero +  ", ");
			}
		saida = saida.substring(0, saida.length() - 2);
		saida += "]";
		System.out.println(saida);
	}

}
