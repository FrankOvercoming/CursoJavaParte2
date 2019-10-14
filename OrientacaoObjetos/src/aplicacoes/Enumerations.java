package aplicacoes;

import java.util.Date;

import entidades.Pedidos;
import entidades.enums.StatusPedidoEnum;

public class Enumerations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedidos pedido = new Pedidos(1000, new Date(), StatusPedidoEnum.Processando );
		System.out.println(pedido);
		
		StatusPedidoEnum st1 = StatusPedidoEnum.Devolvido;
		
		StatusPedidoEnum st2 = StatusPedidoEnum.valueOf("ProcessandO");
		
		System.out.println(st1);
		
		System.out.println(st2);
	}

}
