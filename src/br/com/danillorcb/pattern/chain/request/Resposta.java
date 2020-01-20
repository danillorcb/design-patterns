package br.com.danillorcb.pattern.chain.request;

interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}