package br.com.danillorcb.pattern.state.orcamentos;

class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o e n�o pode ser aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� em estado de reprova��o");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
