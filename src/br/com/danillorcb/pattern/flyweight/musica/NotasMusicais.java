package br.com.danillorcb.pattern.flyweight.musica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> clazzes;

    static {
         clazzes = Arrays.asList(
                    Do.class, Re.class, Mi.class, Fa.class, 
                    Sol.class, La.class, Si.class);
    }

    public Nota pega(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome)) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//public class NotasMusicais {
//
//	private static Map<String, Nota> notas = new HashMap<String, Nota>();
//	
//	static {
//		notas.put("do", new Do());
//		notas.put("re", new Re());
//		notas.put("mi", new Mi());
//		notas.put("fa", new Fa());
//		notas.put("sol", new Sol());
//		notas.put("la", new La());
//		notas.put("si", new Si());
//	}
//	
//	public Nota pega(String nota) {
//		return notas.get(nota);
//	}
//}
