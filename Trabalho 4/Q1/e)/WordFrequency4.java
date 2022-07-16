import java.util.*;

class WordFrequency4 {
    String frase;

    WordFrequency4(String frase) {
        this.frase = frase;
    }

    void frequenciaPalavras() {
        Map<String,Integer> repetidas = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] aux = frase.split(" ");

        for (int i = 0; i < aux.length ; i++)
            palavras.add(aux[i]);

        Collections.sort(palavras);
        for (int i = 0; i < aux.length ; i++) {
            int aux2 = Collections.frequency(palavras,palavras.get(i));
            repetidas.put(palavras.get(i),aux2);
        }

        repetidas.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}
