package br.com.danillorcb.pattern.state.conta;

public interface EstadoDaConta {
	void saca(Double valor, Conta conta);
	void deposita(Double valor, Conta conta);
}
