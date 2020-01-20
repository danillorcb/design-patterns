package br.com.danillorcb.pattern.strategy.investimentos;

public class Conservador implements EstrategiaInvestimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}
