package br.com.danillorcb.pattern.memento.contrato;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		
		Historico historico = new Historico();
		
		Contrato contrato = new Contrato(Calendar.getInstance(), "Cliente 1", TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());
	
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
			
		contrato.restaura(historico.pega(1));
		System.out.println(contrato.getTipo());
	}
}
