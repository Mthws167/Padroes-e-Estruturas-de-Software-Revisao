package Modelo;

import java.util.Date;

public class Carrinho {

	private Date dataCompra = new Date();
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

}
