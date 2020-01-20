package br.com.danillorcb.pattern.template;

public class Main {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(4.50);
		orcamento.adicionaItem(new Item("Caneta azul", 1.50));
		orcamento.adicionaItem(new Item("Azul caneta", 1.50));
		orcamento.adicionaItem(new Item("Caneta azul", 1.50));
		
		ICPP icpp = new ICPP();
		System.out.println("ICPP: " + icpp.calcula(orcamento));
				
		IKCV ikcv = new IKCV();
		System.out.println("IKCV: " + ikcv.calcula(orcamento));
		
		IHIT ihit = new IHIT();
		System.out.println("IHIT: " + ihit.calcula(orcamento));
	}

}
