package br.com.danillorcb.pattern.decorator;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	public ImpostoMuitoAlto() {
		super();
	}
	
	@Override
	double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}

}
