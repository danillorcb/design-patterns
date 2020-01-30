package br.com.danillorcb.pattern.memento.contrato;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	private List<Estado> estados;
	
	public Historico() {
		estados = new ArrayList<Estado>();
	}
	
	public void adiciona(Estado estado) {
		estados.add(estado);
	}
	
	public Estado pega(int index) {
		return estados.get(index);
	}
}
