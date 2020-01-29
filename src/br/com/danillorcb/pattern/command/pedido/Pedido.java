package br.com.danillorcb.pattern.command.pedido;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public void paga() {
		this.status = Status.PAGO;
	}
	
	public void finaliza() {
		this.dataFinalizacao = Calendar.getInstance();
		this.status = Status.ENTREGUE;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", status=" + status + "]";
	}	
}
