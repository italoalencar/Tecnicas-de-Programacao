import java.util.*;

class Main {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> tree = new TreeSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        ArrayList<String> array = new ArrayList<>();

        String v[] = {"a", "b", "c"};
        Verif a = new Verif(hs,v);
        Verif b = new Verif(tree,v);
        Verif c = new Verif(lhs,v);
        Verif d = new Verif(array,v);

        a.verificar(); // HashSet nao entra em nenhum caso.
        b.verificar();
        c.verificar(); // LinkedHashSet nao entra em nenhum caso.
        d.verificar();
    }
}
