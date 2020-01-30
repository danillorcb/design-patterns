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

		// Blues
//		Pattern pattern = new ChordProgression("I IV V")
//                .distribute("7%6")
//                .allChordsAs("$0 $0 $0 $0 $1 $1 $0 $0 $2 $1 $0 $0")
//                .eachChordAs("$0ia100 $1ia80 $2ia80 $3ia80 $4ia100 $3ia80 $2ia80 $1ia80")
//                .getPattern()
//                .setInstrument("Acoustic_Bass")
//                .setTempo(100);
//        new Player().play(pattern);

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
		//piano.toca(doReMiFa);
	}
}
