package br.com.danillorcb.pattern.builder.nf;

class Teste {
	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
                .com(new ItemDaNotaBuilder().comDescricao("item 1").comValor(100.00).build())
                .com(new ItemDaNota("item 2", 200.0))
                .com(new ItemDaNota("item 3", 300.0))
                .comObservacao("entregar nf pessoalmente")
                .build();
		System.out.println(nf.getDataDeEmissao().toString());
	}
}