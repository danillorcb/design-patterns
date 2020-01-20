package br.com.danillorcb.pattern.state.conta;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Double valor, Conta conta) {
		throw new RuntimeException("Não é possível fazer saque em uma conta com saldo negativo");
	}

	@Override
	public void deposita(Double valor, Conta conta) {
		conta.saldo += valor * 0.95;
		if (conta.saldo >= 0) conta.estadoAtual = new Positivo();
	}

}
