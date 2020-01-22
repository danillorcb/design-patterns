package br.com.danillorcb.pattern.template.taxacao;

import java.util.Map;
import java.util.stream.Collectors;

public class IHIT extends TemplateImposto {

	@Override
	double usarMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	double usarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		Map<String, Long> collect = orcamento.getItens().stream().collect(
				Collectors.collectingAndThen(
						Collectors.groupingBy(Item::getNome, Collectors.counting()), 
						m -> {
							 m.values().removeIf(v -> v <= 1L); return m;
						})			
		);
//		System.out.println("Having count(*): " + collect.size());
		if (collect.size() > 0) return true;
		return false;
	}

}
