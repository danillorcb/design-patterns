package br.com.danillorcb.pattern.command.pedido;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {
	
	private List<PedidoCommand> comandos;
	
	public FilaDeTrabalho() {
		comandos = new ArrayList<PedidoCommand>();
	}
	
	public void adiciona(PedidoCommand comando) {
		comandos.add(comando);
	}
	
	public void processa() {
		for (PedidoCommand comando : comandos) {
			comando.executa();
		}
	}
}
