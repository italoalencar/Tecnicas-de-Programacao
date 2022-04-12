import java.util.Arrays;
import java.util.ArrayList;


class Teste {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        ArrayList<Object> b = new ArrayList<>();
        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Object> d = new ArrayList<>();


        a.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        b.addAll(Arrays.asList(0,2,4,6,8));
        c.addAll(Arrays.asList(1,3,5,7,9));
        d.addAll(Arrays.asList(2,3,5,7,11));

        Conjunto n = new Conjunto(a);
        Conjunto par = new Conjunto(b);
        Conjunto impar = new Conjunto(c);
        Conjunto primo = new Conjunto(d);


        System.out.println("Conjuntos:");
        n.mostrarConjunto();
        par.mostrarConjunto();
        impar.mostrarConjunto();
        primo.mostrarConjunto();


        primo.isSub(primo);


        for (int i = 0; i < par.conjunto.size(); i++)
            n.pertinencia(par.conjunto.get(i));
        System.out.println();

        for (int i = 0; i < impar.conjunto.size(); i++)
            n.pertinencia(impar.conjunto.get(i));
        System.out.println();

        for (int i = 0; i < primo.conjunto.size(); i++)
            n.pertinencia(primo.conjunto.get(i));
        System.out.println();

        par.uniao(impar).mostrarConjunto();
        
        n.intersec(par).mostrarConjunto();

        n.diferenca(par).mostrarConjunto();

        par.produtoCartesiano(impar);

    }  

}