package br.com.danillorcb.pattern.template.relatorios;

public class RelatorioSimples extends TemplateRelatorios {

	@Override
	protected void imprimeRodape(Banco banco) {
		System.out.printf("%n%50s", banco.getTelefone());
	}

	@Override
	protected void imprimeCorpo(Banco banco) {
		for (Conta conta : banco.getContas()) {
			System.out.printf("%-30s%20.2f%n", conta.getTitular(), conta.getSaldo());
		}
	}

	@Override
	protected void imprimeCabecalho(Banco banco) {
		System.out.printf("%50s%n%n", banco.getNome());		
	}

}
