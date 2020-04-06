package aplicacoes;

import java.util.List;
import java.util.Arrays;

public class TesteDeListCuringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> teste = Arrays.asList("oi","Maria", "joao");
		imprime(teste);
	}
	
	public static <T> void imprime(List<T> lista) {
		lista.add((T) "casa");
		for(Object obj : lista) {
			System.out.println(obj);
		}
	}

}
