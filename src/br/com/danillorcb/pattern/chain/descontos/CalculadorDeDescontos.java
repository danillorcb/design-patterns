package br.com.danillorcb.pattern.chain.descontos;

/**
 * @author danillorcb
 *
 * Classe respons�vel pelas instancia��es e encadeamentos dos pr�ximos descontos.
 * 
 */
public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto descontoFinal = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(descontoFinal);
		
		return d1.desconta(orcamento);
	}
}