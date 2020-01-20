package br.com.danillorcb.pattern.chain.request;

public class Conta {
	private String titular;
	private double saldo;

	public Conta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

}
