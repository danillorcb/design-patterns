package br.com.danillorcb.pattern.strategy;

/**
 *  
 * Crie a classe CalculadorDeImpostos, que possui um m�todo que recebe um Orcamento e um Imposto. 
 * Essa m�todo calcula o imposto usando a estrat�gia recebida e imprime o resultado na tela.
 *  
 * @author Danillo
 *
 */
public class CalculadorDeImpostos {
	
	public void calcula(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
