package br.com.danillorcb.pattern.state.conta;

public class Conta {

	protected Double saldo;
	protected EstadoDaConta estadoAtual;

	public Conta() {
		this.saldo = 0d;
		this.estadoAtual = new Positivo();
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saca(Double valor) {
		this.estadoAtual.saca(valor, this);
	}
	
	public void deposita(Double valor) {
		this.estadoAtual.deposita(valor, this);
	}

}
