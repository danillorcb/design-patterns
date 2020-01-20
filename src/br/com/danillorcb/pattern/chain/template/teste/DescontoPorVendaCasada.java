package br.com.danillorcb.pattern.chain.template.teste;

public class DescontoPorVendaCasada extends TemplateDesconto {

	@Override
	protected double calculaDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected boolean isDescontoValido(Orcamento orcamento) {
		return orcamento.contemItemDeNome("LAPIS") && orcamento.contemItemDeNome("CANETA");
	}
}
