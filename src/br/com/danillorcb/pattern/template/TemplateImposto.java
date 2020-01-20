package br.com.danillorcb.pattern.template;

public abstract class TemplateImposto implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return usarMaximaTaxacao(orcamento);
		} else {
			return usarMinimaTaxacao(orcamento);
		}
	}

	abstract double usarMinimaTaxacao(Orcamento orcamento);
	abstract double usarMaximaTaxacao(Orcamento orcamento);
	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
