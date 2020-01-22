package br.com.danillorcb.pattern.decorator.impostos;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		
		Imposto impostoComplexo = new ISS(new ICMS(new ICCC(new ImpostoMuitoAlto(new ICPP()))));
//		Imposto impostoComplexo = new ISS();
//		impostoComplexo = new ICMS(impostoComplexo);
//		impostoComplexo = new ICCC(impostoComplexo);
//		impostoComplexo = new ICPP(impostoComplexo);
//		impostoComplexo = new ImpostoMuitoAlto(impostoComplexo);
		
        Orcamento orcamento = new Orcamento(500.0);

        double valor = impostoComplexo.calcula(orcamento);

        System.out.println(valor);
	}
}
