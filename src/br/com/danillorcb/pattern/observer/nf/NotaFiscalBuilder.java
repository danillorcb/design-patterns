package br.com.danillorcb.pattern.observer.nf;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double valorBruto;
	private double impostos;
	private String obs;
	private Calendar data;
	
	private List<AcaoAposGerarNota> acoesASeremExecutasAposCriarNF;
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		acoesASeremExecutasAposCriarNF = acoes;
		data = Calendar.getInstance();
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String obs) {
		this.obs = obs;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}

	public NotaFiscal build() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, obs);
		
		for (AcaoAposGerarNota acao : acoesASeremExecutasAposCriarNF) {
			acao.executa(nf);
		}
		
		return nf;
	}

}
