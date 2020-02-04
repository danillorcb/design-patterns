package br.com.danillorcb.pattern.visitor.expressao;

public interface Visitor {
	void visitaSoma(Soma soma);
	void visitaSubtracao(Subtracao subtracao);
	void visitaMultiplicacao(Multiplicacao multiplicacao);
	void visitaDivisao(Divisao divisao);
	void visitaNumero(Numero numero);
	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
}
