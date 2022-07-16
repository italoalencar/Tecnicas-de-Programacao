import java.util.*;

public class WordFrequency3 {
    String frase;

    public WordFrequency3(String frase) {
        this.frase = frase;
    }

    public void frequenciaPalavras() {
        Map<String,Integer> repetidas = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] aux = frase.split(" ");

        for (int i = 0; i < aux.length; i++)
            palavras.add(aux[i]);

        Collections.sort(palavras);
        for (int i = 0; i < aux.length ; i++) {
            int axu2 = Collections.frequency(palavras,palavras.get(i));
            repetidas.put(palavras.get(i),axu2);
        }

        repetidas.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).forEach(System.out::println);
    }
}