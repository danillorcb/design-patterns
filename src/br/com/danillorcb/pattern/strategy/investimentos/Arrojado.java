package br.com.danillorcb.pattern.strategy.investimentos;

import java.util.Random;

public class Arrojado implements EstrategiaInvestimento {

	private Random random;
	
	public Arrojado() {
		this.random = new Random();
	}
	
	@Override
	public double calcula(Conta conta) {
		int chanceRetorno = random.nextInt(10);		
		
		if (chanceRetorno < 2) {
			return conta.getSaldo() * 0.05;
		} else if (chanceRetorno < 5) {
			return conta.getSaldo() * 0.03;
		} else {
			return conta.getSaldo() * 0.006;
		}
	}

}
