import java.util.*;

class CountWords {
    String frase;
    int total = 0;
    int dist = 0;
     

    CountWords(String frase) {
        this.frase = frase;
    }

    int getTotal() { 
        return this.total;
    }
    
    int getDist() {
        return this.dist;
    }
    
    void contarPalavras() {
        ArrayList<String> palavras = new ArrayList<String>();
        String[] aux = frase.split(" ");

        for (int i = 0; i < aux.length ; i++) {
            palavras.add(aux[i]);
            total++;
        }

        Map<String, Integer> cont = new HashMap<>();
        for (int i = 0; i < palavras.size(); i++) {

            if (cont.containsKey(palavras.get(i)))
                cont.put(palavras.get(i), cont.get(palavras.get(i)) + 1);
            else
                cont.put(palavras.get(i),1);
        }

        dist = cont.size();
        System.out.println(this.toString());
        
    }

    public String toString() {
        return "Total de Palavras: " + this.total + "\nTotal de Palavras Distintas: " + this.dist;

    }

}