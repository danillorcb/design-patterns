package br.com.danillorcb.pattern.visitor.expressao;

public interface Expressao {

	int avalia();
	void aceita(Visitor visitor);
}
