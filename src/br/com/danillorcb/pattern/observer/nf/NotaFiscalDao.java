package br.com.danillorcb.pattern.observer.nf;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salvo no banco");
	}

}
