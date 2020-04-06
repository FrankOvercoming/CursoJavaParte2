package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.management.InvalidAttributeValueException;

public class GenericsImpressaoServicoSemGenerics {
	
	private List<Integer> lista = new ArrayList<>();
	
	public void adicionaValor(Integer valor) {
		
		lista.add(valor);
		
	}

	public Integer primeiroValor() throws InvalidAttributeValueException {
		
		if (lista.isEmpty() || lista == null) {
			
			throw new InvalidAttributeValueException("A lista não contém dados !!");
		}
		
		return lista.get(0);
	}
	
	public void imprimir() throws InvalidAttributeValueException {
		
		if (lista.isEmpty() || lista == null) {
			throw new InvalidAttributeValueException("A lista não contém dados !!");
		}
		String saida = "";
		saida += ("[");

		for ( Integer numero : lista) {
				
				saida += (numero +  ", ");
			}
		saida = saida.substring(0, saida.length() - 2);
		saida += "]";
		System.out.println(saida);
	}

}
