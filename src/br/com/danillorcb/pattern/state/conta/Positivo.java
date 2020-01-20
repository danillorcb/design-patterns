package br.com.danillorcb.pattern.state.conta;

public class Positivo implements EstadoDaConta {

	@Override
	public void saca(Double valor, Conta conta) {
		conta.saldo -= valor;
		if (conta.saldo < 0) conta.estadoAtual = new Negativo();
	}

	@Override
	public void deposita(Double valor, Conta conta) {
		conta.saldo += valor * 0.98;
	}

}
