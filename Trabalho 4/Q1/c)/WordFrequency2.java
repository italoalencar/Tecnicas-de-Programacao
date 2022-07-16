import java.util.*;

class WordFrequency2 {
    String frase;

    WordFrequency2(String frase) {  
        this.frase = frase;
    }

    void frequenciaPalavras(){
        Map<String,Integer> repetidas = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] aux = frase.split(" ");

        for (int i = 0; i < aux.length ; i++)
            palavras.add(aux[i]);

        Collections.sort(palavras); // Sortando o arraylist antes de inseri-lo no hashmap
        for (int i = 0; i < aux.length ; i++ ) {
            int ocurrences = Collections.frequency(palavras,palavras.get(i));
            repetidas.put(palavras.get(i),ocurrences);
        }

        TreeMap<String, Integer> sorted = new TreeMap<>(repetidas);
        for (Map.Entry <String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}