package br.com.danillorcb.pattern.chain.descontos;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
