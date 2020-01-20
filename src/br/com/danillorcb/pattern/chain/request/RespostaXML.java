package br.com.danillorcb.pattern.chain.request;

public class RespostaXML implements Resposta {
	
	private Resposta proxima;

	public RespostaXML(Resposta proxima) {
		this.proxima = proxima;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
			return;
		}
		this.proxima.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}

}
