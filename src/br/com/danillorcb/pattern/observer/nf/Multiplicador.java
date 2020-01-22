package br.com.danillorcb.pattern.observer.nf;

public class Multiplicador implements AcaoAposGerarNota {

	private double fator;
		
	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Valor da NF multiplicado pelo fator (" + fator + "): " + nf.getValorBruto() * fator);
	}

}
