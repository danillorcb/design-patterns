package br.com.danillorcb.pattern.strategy.investimentos;

public class RealizadorDeInvestimentos {
	
	public void calcula(Conta conta, EstrategiaInvestimento estrategia) {
		double valor = estrategia.calcula(conta);
		
		conta.deposita(valor * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
