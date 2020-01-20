package br.com.danillorcb.pattern.state.conta;

public class Main {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(-1.0);
		conta.deposita(100.0);
//		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
	}
}
