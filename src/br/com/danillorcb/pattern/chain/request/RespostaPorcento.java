package br.com.danillorcb.pattern.chain.request;

public class RespostaPorcento implements Resposta {

	private Resposta proxima; 
	
	public RespostaPorcento(Resposta proxima) {
		this.proxima = proxima;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
			return;
		}
		this.proxima.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}

}
