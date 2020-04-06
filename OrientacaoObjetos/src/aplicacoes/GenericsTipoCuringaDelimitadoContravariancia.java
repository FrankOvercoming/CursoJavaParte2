package aplicacoes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTipoCuringaDelimitadoContravariancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> listaObj = new ArrayList<Object>();
		listaObj.add("maria");
		listaObj.add("joao");
		
		List<? super Number> listContra = listaObj;
		// Acima estou dizendo que a lista ir� aceitar qualquer tipo que seja Number ou
		// super tipo de Number, como no caso seria Object, pois a super classe de Number �
		// Object
		// Regra para Generics Tipo Curinga Delimitado
		// Regra para Generics Tipo Curinga Delimitado Contravariancia
		
		listContra.add(10);
		listContra.add(20);
		
		// ainda posso adicionar itens nesta lista listaObj que ir� aparecer na lista
		// listContra pois a listContra aponta para o objeto listaObj
		// Regra para objeto
		// Regra para apontamento de objeto
		// Regra para variavel objeto
		
		listaObj.add("mais um");
		
		Object tipoString = "Jose";
		System.out.println(tipoString.getClass().getSimpleName() );
		// n�o posso recuperar itens da listContra pois o compilador n�o sabe se dentro
		// dela tem algum tipo que seja super de Number
		//	Number saida = listContra.get(0);
		// Regra para Generics Tipo Curinga Delimitado
		// Regra para Generics Tipo Curinga Delimitado Delimitado Contravariancia
		// Regra para Contravariancia
		
		// Na Contravariancia eu posso adicionar itens mas n�o posso recuperar itens
		// posso fazer put mas n�o posso fazer get
		// Regra para Contravariancia
		
		System.out.println(listContra);
		
	}

}
