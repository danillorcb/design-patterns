package br.com.danillorcb.pattern.interpreter.expressao;

public class Programa {

	public static void main(String[] args) {

		Soma soma = new Soma(new Numero(2), new Numero(8)); // 2 + 8 = 10
		Subtracao sub = new Subtracao(soma, new Numero(1)); //(2 + 8) - 1 = 9
		
		RaizQuadrada raizQuadrada = new RaizQuadrada(sub); // Raiz de 9 = 3
		
		System.out.println(raizQuadrada.avalia()); // 3
	}

}
