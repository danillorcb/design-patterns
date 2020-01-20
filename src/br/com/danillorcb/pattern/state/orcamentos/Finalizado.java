package br.com.danillorcb.pattern.state.orcamentos;

class Finalizado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento está em estado de finalização e não pode ser a	provado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento está em estado de finalização e não pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}
}