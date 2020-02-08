package br.com.danillorcb.pattern.bridge.mapas;

public class Programa {

	public static void main(String[] args) {

		String rua = "Rua Tosca, 123";

		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa(rua);
	}

}
