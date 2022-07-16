import java.util.*;

class Verif {
    Collection<String> c;

    Verif(Collection<String> c,String[] v) {
        for(String aux:v)
            c.add(aux);    
        this.c = c;
    }

    void verificar() {
        if(c instanceof List)
            System.out.println("Permite a inclusao de elementos duplicados.");

        if((c instanceof SortedSet)||(c instanceof SortedMap))
            System.out.println("Ordena automaticamente os elementos inseridos nela.");
    
        if(c instanceof LinkedList)
            System.out.println("Garante a ordem de entrada dos elementos na colecao");           
    }

}