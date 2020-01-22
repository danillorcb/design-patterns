package br.com.danillorcb.pattern.strategy.funcionarios;

/**
 * Crie o imposto que se chama ICCC, que retorna
 * 5% do valor total caso o orçamento seja menor do que R$ 1000,00 reais, 
 * 7% caso o valor esteja entre R$ 1000 e R$ 3000,00 com os limites inclusos, 
 * ou 8% mais 30 reais, caso o valor esteja acima de R$ 3000,00.
 * 
 * @author Danillo
 *
 */
public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1000) {
			return valor * 0.05;
		} else if (valor <= 3000) {
			return valor * 0.07;
		} else {
			return valor * 0.08 + 30;
		}
	}	
}
