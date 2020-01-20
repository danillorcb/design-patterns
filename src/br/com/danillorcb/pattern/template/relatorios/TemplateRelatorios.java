package br.com.danillorcb.pattern.template.relatorios;

public abstract class TemplateRelatorios implements Relatorio {

	@Override
	public void gerar(Banco banco) {
		imprimeCabecalho(banco);
		imprimeCorpo(banco);
		imprimeRodape(banco);
	}

	protected abstract void imprimeRodape(Banco banco);
	protected abstract void imprimeCorpo(Banco banco);
	protected abstract void imprimeCabecalho(Banco banco);

}
