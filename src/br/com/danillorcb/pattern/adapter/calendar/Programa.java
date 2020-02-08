package br.com.danillorcb.pattern.adapter.calendar;

import java.text.SimpleDateFormat;

public class Programa {

	public static void main(String[] args) {

		Relogio relogio = new RelogioDoSistema();
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(relogio.hoje().getTime()));
	}

}
