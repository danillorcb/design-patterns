package br.com.danillorcb.pattern.flyweight.musica;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> notas) {
		
		StringBuilder musica = new StringBuilder();
		for (Nota nota : notas) {
			musica.append(nota.simbolo() + " ");
		}
		
		Player player = new Player();
		player.play(musica.toString());
	}
}
