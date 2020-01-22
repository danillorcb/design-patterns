package br.com.danillorcb.pattern.observer.nf;

import java.util.ArrayList;

class Teste {
	public static void main(String[] args) {
		
		ArrayList<AcaoAposGerarNota> acoes = new ArrayList<>();
		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDao());
		acoes.add(new EnviadorDeSMS());
		acoes.add(new Impressora());
		acoes.add(new Multiplicador(2.5));
		
		NotaFiscal nf = new NotaFiscalBuilder(acoes)
				.paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
                .com(new ItemDaNotaBuilder().comDescricao("item 1").comValor(100.00).build())
                .com(new ItemDaNotaBuilder().comDescricao("item 2").comValor(200.00).build())
                .com(new ItemDaNotaBuilder().comDescricao("item 3").comValor(300.00).build())
                .comObservacao("entregar nf pessoalmente")
                .build();
		
		System.out.println(nf.getValorBruto());
	}
}