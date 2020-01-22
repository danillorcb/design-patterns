package br.com.danillorcb.pattern.observer.nf;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviado por email");
	}

}
