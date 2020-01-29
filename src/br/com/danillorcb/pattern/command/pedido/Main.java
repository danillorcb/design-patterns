package br.com.danillorcb.pattern.command.pedido;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("Cliente 1", 350.0);
		Pedido pedido2 = new Pedido("Cliente 2", 750.0);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new FinalizaPedido(pedido2));
		
		fila.processa();
		
		System.out.println(pedido1.toString());
		System.out.println(pedido2.toString());
	}

}
