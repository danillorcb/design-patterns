package br.com.danillorcb.pattern.command.pedido;

public class PagaPedido implements PedidoCommand {

	private Pedido pedido;
	
	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		pedido.paga();
	}

}
