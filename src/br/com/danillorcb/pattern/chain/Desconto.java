package br.com.danillorcb.pattern.chain;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
