package br.com.danillorcb.pattern.chain.template.teste;

public abstract class TemplateDesconto implements Desconto {
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (isDescontoValido(orcamento)) {
			return calculaDesconto(orcamento);
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
	
	protected abstract double calculaDesconto(Orcamento orcamento);	
	protected abstract boolean isDescontoValido(Orcamento orcamento);
}
