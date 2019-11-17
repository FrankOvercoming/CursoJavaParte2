package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.Exercicio1StatusPedido;

public class Exercicio1Pedido {
	private Date dataPedido;
	private Exercicio1StatusPedido statusPedido;
	// SimpleDateFormat sdf foi instanciado como static pois assim todo objeto postagens
		// criado não criará um objeto sdf novo, pois static pertence a classe, assim sendo
		// economizando memoria e recursos
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private List<Exercicio1PedidoItens> itensPedido = new ArrayList<>();

	public Exercicio1Pedido() {
		
		dataPedido = new Date();
	}
	
	public Exercicio1Pedido(Date dataPedido, Exercicio1StatusPedido statusPedido) {
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;

	}

	public String getDataPedido() {
		return sdf.format(dataPedido);
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Exercicio1StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Exercicio1StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	public void adicionaPedidoItens(Exercicio1PedidoItens pedidoItens) {
		itensPedido.add(pedidoItens);
	}
	
	public void removerPedidoItens(Exercicio1PedidoItens pedidoItens) {
		itensPedido.remove(pedidoItens);
	}
	
	
	public List<Exercicio1PedidoItens> getItensPedido() {
		return itensPedido;
	}


	public Double totalPedido() {
		Double saida =  0D;
		for ( Exercicio1PedidoItens itenPedido : itensPedido ) {
			saida += itenPedido.subTotal();
		}
		return saida;
	}
}
