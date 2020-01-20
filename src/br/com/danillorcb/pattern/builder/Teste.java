package br.com.danillorcb.pattern.builder;

class Teste {
	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacao("entregar nf pessoalmente")
                .naDataAtual()
                .build();
		System.out.println(nf.getValorBruto());
	}
}