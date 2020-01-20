package br.com.danillorcb.pattern.decorator.filtro;

import java.util.Date;

public class Conta {

	private String agencia;
	private String numero;
	private String titular;
	private Double saldo;
	private Date dataAbertura;

//	public Conta(String agencia, String numero, String titular, Double saldo) {
//		this.agencia = agencia;
//		this.numero = numero;
//		this.titular = titular;
//		this.saldo = saldo;
//	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + "]";
	}

	
}
