package br.com.danillorcb.pattern.visitor.expressao;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int esquerda = this.esquerda.avalia();
		int direita = this.direita.avalia();
		return esquerda * direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
	}
}
