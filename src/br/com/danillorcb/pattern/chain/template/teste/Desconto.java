package br.com.danillorcb.pattern.chain.template.teste;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
