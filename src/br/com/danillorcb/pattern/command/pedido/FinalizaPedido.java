package br.com.danillorcb.pattern.command.pedido;

public class FinalizaPedido implements PedidoCommand {

	private Pedido pedido;
	
	public FinalizaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void executa() {
		pedido.finaliza();
	}

}
