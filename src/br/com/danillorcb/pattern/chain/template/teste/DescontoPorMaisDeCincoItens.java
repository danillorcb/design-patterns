package br.com.danillorcb.pattern.chain.template.teste;

public class DescontoPorMaisDeCincoItens extends TemplateDesconto {

	@Override
	protected double calculaDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean isDescontoValido(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}
}

