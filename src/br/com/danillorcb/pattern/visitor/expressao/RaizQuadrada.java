package br.com.danillorcb.pattern.visitor.expressao;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}

	public Expressao getExpressao() {
		return expressao;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}
}
