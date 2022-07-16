import java.util.*;

class Teste_Hash2L {
    public static void main(String[] args) {
        
        LinkedHashSet<String> mesesHash = new LinkedHashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");

        System.out.println("HashSet:");
        listar(mesesHash);
        listar2(mesesHash);
    }

    static void listar(Collection c) {
        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    static void listar2(Collection c) {
        System.out.println("*** Listar 2 ***");
        for (Object o : c)
            System.out.println(o);
    }

}