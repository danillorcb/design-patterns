package br.com.danillorcb.pattern.decorator.impostos;
public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {
		super();
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50 + calculoDoOutroImposto(orcamento);
	}
}