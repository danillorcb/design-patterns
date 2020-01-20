package br.com.danillorcb.pattern.builder;

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
	private Calendar dataAtual;
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String obs) {
		this.obs = obs;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.dataAtual = Calendar.getInstance();
		return this;
	}

	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, impostos, todosItens, obs);
	}
}
