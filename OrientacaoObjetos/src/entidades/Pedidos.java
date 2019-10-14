package entidades;

import java.util.Date;

import entidades.enums.StatusPedidoEnum;

public class Pedidos {
	
	private Integer id;
	private Date dataPedido;
	private StatusPedidoEnum statusPedido;
	
	public Pedidos() {
		
	}

	public Pedidos(Integer id, Date dataPedido, StatusPedidoEnum statusPedido) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedidoEnum getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedidoEnum statusPedido) {
		this.statusPedido = statusPedido;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", dataPedido=" + dataPedido + ", statusPedido=" + statusPedido + "]";
	}
	
	

}
