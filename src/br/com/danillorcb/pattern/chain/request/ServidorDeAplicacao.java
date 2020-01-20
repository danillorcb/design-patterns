package br.com.danillorcb.pattern.chain.request;

public class ServidorDeAplicacao {

	public void responde(Requisicao req, Conta conta) {
		Resposta respFinal = new RespostaFinal();
		Resposta resp3 = new RespostaPorcento(respFinal);
		Resposta resp2 = new RespostaCSV(resp3);
		Resposta resp1 = new RespostaXML(resp2);

//		resp1.setProxima(resp2);
//		resp2.setProxima(resp3);
//		resp3.setProxima(respFinal);

		resp1.responde(req, conta);
	}

}
