package aplicacoes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTipoCuringaDelimitadoCovariancia {
	
	public void main(String[] args) {
	
		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(5);
		
		List<? extends Number> list1 = lista;
		// Number é super classe dos wrappers de numeros
		// Regra para Wrapper classes numéricos
		// Regra para numeros
		
		Number x = list1.get(0);
		
		// list1.add(20); //da erro de compilação
		// não podemos adicionar pois o compilador não sabe se os numeros da lista serão
		// compativeis com o numero adicionado pois a list1 aceita qualquer objeto que seja
		// sub tipo de number, isto é, que implemente essa classe
		// isto é chamado de covariancia quando a operação de get é permitida
		// mas a operação de put não é permitida, isto é, vc não pode adicionar na lista
		// operação get é permitida mas a put não é permitida
		// mas pode pegar os dados da lista
		// Regra para Generics Tipo Curinga
		// Regra para Generics Covariancia
		// Regra para Covariancia

		// isto acontece porque aceita qualquer tipo de implemente Number quer dizer que 
		// quando o resultado for adicionado não da pra fazer casting nele pois ele
		// será um objeto filho de Number e casting automatico só faz de baixo para cima
		// isto é, eu posso adicionar um Number num object diretamente sem precisar dizer
		// ao compilador para fazer casting, mas não posso adicionar um object num Number
		// sem informar ao compilador para fazer casting nele porque o compilador não
		// sabe o que esse object é na verdade
		// Regra para Casting automatico  
		// Exemplo de casting automatico
		Object obj;
		obj = list1.get(0);
		// Regra para Casting
		
	
	}

}
