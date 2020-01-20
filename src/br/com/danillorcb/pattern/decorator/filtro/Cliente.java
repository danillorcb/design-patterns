package br.com.danillorcb.pattern.decorator.filtro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.setTitular("Aldo");
		c1.setSaldo(99.00);
		c1.setDataAbertura(new Date());
		
		Conta c2 = new Conta();
		c2.setTitular("Baldo");
		c2.setSaldo(101.00);
		c2.setDataAbertura(new Date());
		
		Conta c3 = new Conta();
		c3.setTitular("Clodoaldo");
		c3.setSaldo(555_000.00);
		c3.setDataAbertura(new Date());
		
		Conta c4 = new Conta();
		c4.setTitular("Donaldo");
		c4.setSaldo(400.00);
		c4.setDataAbertura(new Date());
		
		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		
		Filtro filtro = new FiltroSaldoMenorQue100(new FiltroSaldoMaiorQue500Mil());
		System.out.println(filtro.filtra(contas));
	}
}
