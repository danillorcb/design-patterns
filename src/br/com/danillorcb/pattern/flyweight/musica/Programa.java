package br.com.danillorcb.pattern.flyweight.musica;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

//		Player player = new Player();
//	    player.play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ");
		
//		Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
//	    Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");
//	    Player player = new Player();
//	    player.play(p1, p2);
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> doReMiFa = Arrays.asList(
			notas.pega("do"),    
		    notas.pega("re"),    
		    notas.pega("mi"),    
		    notas.pega("fa"),    
		    notas.pega("fa"),    
		    notas.pega("fa"),    

		    notas.pega("do"),    
		    notas.pega("re"),    
		    notas.pega("do"),    
		    notas.pega("re"),    
		    notas.pega("re"),    
		    notas.pega("re"),

		    notas.pega("do"),    
		    notas.pega("sol"),    
		    notas.pega("fa"),    
		    notas.pega("mi"),    
		    notas.pega("mi"),    
		    notas.pega("mi"),
		    
		    notas.pega("do"),    
		    notas.pega("re"),    
		    notas.pega("mi"),    
		    notas.pega("fa"),    
		    notas.pega("fa"),    
		    notas.pega("fa")
		);

		System.out.println(doReMiFa);
		
		Piano piano = new Piano();
		piano.toca(doReMiFa);
	}
}
