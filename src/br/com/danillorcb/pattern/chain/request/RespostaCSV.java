package br.com.danillorcb.pattern.chain.request;

public class RespostaCSV implements Resposta {

	private Resposta proxima;

	public RespostaCSV(Resposta proxima) {
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
			return;
		}
		this.proxima.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}

}
