package br.com.danillorcb.pattern.chain.request;

public class Main {

	public static void main(String[] args) {

		new ServidorDeAplicacao().responde(
				new Requisicao(Formato.XML), 
				new Conta("Danillo", 120.34));
	}

}
