package br.com.danillorcb.pattern.state.orcamentos;

class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento está em estado de reprovação e não pode ser aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está em estado de reprovação");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
