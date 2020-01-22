package br.com.danillorcb.pattern.observer.nf;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimindo...");
	}

}
