package br.com.danillorcb.pattern.chain.descontos;

/**
 * @author danillorcb
 *
 * Interface que serve de base para os tipos/condi��es de desconto poss�veis.
 *
 */
public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
