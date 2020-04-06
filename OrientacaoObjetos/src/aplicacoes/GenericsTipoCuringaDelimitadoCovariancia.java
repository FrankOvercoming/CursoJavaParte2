package aplicacoes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTipoCuringaDelimitadoCovariancia {
	
	public void main(String[] args) {
	
		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(5);
		
		List<? extends Number> list1 = lista;
		// Number � super classe dos wrappers de numeros
		// Regra para Wrapper classes num�ricos
		// Regra para numeros
		
		Number x = list1.get(0);
		
		// list1.add(20); //da erro de compila��o
		// n�o podemos adicionar pois o compilador n�o sabe se os numeros da lista ser�o
		// compativeis com o numero adicionado pois a list1 aceita qualquer objeto que seja
		// sub tipo de number, isto �, que implemente essa classe
		// isto � chamado de covariancia quando a opera��o de get � permitida
		// mas a opera��o de put n�o � permitida, isto �, vc n�o pode adicionar na lista
		// opera��o get � permitida mas a put n�o � permitida
		// mas pode pegar os dados da lista
		// Regra para Generics Tipo Curinga
		// Regra para Generics Covariancia
		// Regra para Covariancia

		// isto acontece porque aceita qualquer tipo de implemente Number quer dizer que 
		// quando o resultado for adicionado n�o da pra fazer casting nele pois ele
		// ser� um objeto filho de Number e casting automatico s� faz de baixo para cima
		// isto �, eu posso adicionar um Number num object diretamente sem precisar dizer
		// ao compilador para fazer casting, mas n�o posso adicionar um object num Number
		// sem informar ao compilador para fazer casting nele porque o compilador n�o
		// sabe o que esse object � na verdade
		// Regra para Casting automatico  
		// Exemplo de casting automatico
		Object obj;
		obj = list1.get(0);
		// Regra para Casting
		
	
	}

}
