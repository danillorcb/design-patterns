package br.com.danillorcb.pattern.chain.descontos;

public class DescontoPorMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;
	
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
