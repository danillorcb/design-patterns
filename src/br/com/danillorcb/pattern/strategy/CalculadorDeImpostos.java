package br.com.danillorcb.pattern.strategy;

/**
 *  
 * Crie a classe CalculadorDeImpostos, que possui um método que recebe um Orcamento e um Imposto. 
 * Essa método calcula o imposto usando a estratégia recebida e imprime o resultado na tela.
 *  
 * @author Danillo
 *
 */
public class CalculadorDeImpostos {
	
	public void calcula(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
