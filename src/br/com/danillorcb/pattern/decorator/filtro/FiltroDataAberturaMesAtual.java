package br.com.danillorcb.pattern.decorator.filtro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroDataAberturaMesAtual extends Filtro {

	public FiltroDataAberturaMesAtual(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroDataAberturaMesAtual() {
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		for (Conta c : contas) {
			if (c.getDataAbertura().getMonth() == Calendar.getInstance().get(Calendar.MONTH)
					&& c.getDataAbertura().getYear() == Calendar.getInstance().get(Calendar.YEAR)) {
				contasFiltradas.add(c);
			}
		}
		contasFiltradas.addAll(proximo(contas));
		return contasFiltradas;
	}

}
