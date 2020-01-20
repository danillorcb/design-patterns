package br.com.danillorcb.pattern.strategy.investimentos;

public class Conta {
	private double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}