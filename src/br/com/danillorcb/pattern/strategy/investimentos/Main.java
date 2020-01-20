package br.com.danillorcb.pattern.strategy.investimentos;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100.00);
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.calcula(conta, new Conservador());
	}
}
