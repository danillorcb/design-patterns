package br.com.danillorcb.pattern.strategy;

/**
 * Crie todo o mecanismo para flexibilizar a cria��o de diferentes estrat�gias de impostos, igual visto no v�deo. 
 * 
 * Crie a interface Imposto, e as estrat�gias ICMS e ISS. 
 * O ISS deve ser 6% do valor do or�amento; 
 * O ICMS deve ser 5% do valor do or�amento mais o valor fixo de R$ 50,00.
 * 
 * Crie a classe Orcamento, que tem como atributo um valor. Crie um construtor que recebe esse valor, e um getter para devolv�-lo.
 * 
 * Crie a classe CalculadorDeImpostos, que possui um m�todo que recebe um Orcamento e um Imposto. 
 * Essa m�todo calcula o imposto usando a estrat�gia recebida e imprime o resultado na tela.
 * 
 * */
public class Main {

	public static void main(String[] args) {

		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		calculadorDeImpostos.calcula(new Orcamento(100.00), new ICCC());
		calculadorDeImpostos.calcula(new Orcamento(1000.00), new ICCC());		
		calculadorDeImpostos.calcula(new Orcamento(10000.00), new ICCC());

		
//		Orcamento orcamento = new Orcamento(10000.00);
//
//		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
//		calculadorDeImpostos.calcula(orcamento, new ISS());
//		calculadorDeImpostos.calcula(orcamento, new ICMS());
//		
//		calculadorDeImpostos.calcula(orcamento, new ICCC());
	}

}
