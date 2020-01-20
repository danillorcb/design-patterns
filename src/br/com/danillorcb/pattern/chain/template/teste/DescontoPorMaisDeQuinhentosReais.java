package br.com.danillorcb.pattern.chain.template.teste;

public class DescontoPorMaisDeQuinhentosReais extends TemplateDesconto {

	@Override
	protected double calculaDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean isDescontoValido(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}
}
