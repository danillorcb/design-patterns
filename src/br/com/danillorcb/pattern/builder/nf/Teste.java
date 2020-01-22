package br.com.danillorcb.pattern.builder.nf;

class Teste {
	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscalBuilder()
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