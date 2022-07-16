import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class WordFrequency {
    String frase;

    WordFrequency(String frase) {   
        this.frase = frase;
    }

    void frequenciaPalavras() {
        Map<String,Integer> repetidas = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] aux = frase.split(" ");

        for (int i = 0; i < aux.length ; i++)
            palavras.add(aux[i]);

        for (int i = 0; i < aux.length ; i++  ) {
            int aux2 = Collections.frequency(palavras,palavras.get(i));
            repetidas.put(palavras.get(i),aux2);
        }
        
        Iterator<Entry<String, Integer>> iter = repetidas.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mapElement = (Map.Entry)iter.next();
            int valor = ((int)mapElement.getValue());
            System.out.println(mapElement.getKey() + ": " + valor);
        }
    }
}