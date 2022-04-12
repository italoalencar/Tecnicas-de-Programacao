import java.util.ArrayList;
import java.util.List;

class Conjunto {
    List <Object> conjunto;

    Conjunto () {
        conjunto = new ArrayList<Object>();
    }

    Conjunto (List <Object> conj) {
        conjunto = new ArrayList<Object>();
        for (int i = 0; i < conj.size(); i++) {
            conjunto.add(conj.get(i));
        }

    }

    void mostrarConjunto() {

        System.out.print("{");
        if (conjunto.size() == 1)
            System.out.print(conjunto.get(0));
        else {
            for (int i = 0; i < conjunto.size() - 1; i++)
                System.out.print(conjunto.get(i) + ", ");
            if (conjunto.size() != 0)    
                System.out.print(conjunto.get(conjunto.size()-1));
        }
        System.out.println("}");
        System.out.println();
    }

    void insercao(Object elemento) {
        conjunto.add(elemento);
    }

    void pertinencia(Object elemento) {
        for (int i = 0; i < conjunto.size(); i++) {
            if (conjunto.get(i) == elemento) {
                System.out.println(elemento + " pertence ao conjunto");
                return;
            }
        }
        System.out.println(elemento + " nao pertence ao conjunto");
    }

    void isSub(Conjunto sub) {
        if (sub.conjunto.size() > conjunto.size()) {
            System.out.println("Nao eh subconjunto");
        }
        else {
            int i = 0;
            while (i < sub.conjunto.size()) {
                int j = 0;
                while (sub.conjunto.get(i) != conjunto.get(j) && j < conjunto.size()) {
                    j++;
                }
                if (j == conjunto.size()){
                    System.out.println("Nao eh subconjunto");
                    System.out.println();
                    return;
                }    
                i++;
            }
            System.out.println("Eh subconjunto");
        }
        System.out.println();
    }


    Conjunto uniao(Conjunto u) {
        Conjunto ab = new Conjunto(this.conjunto);
        int i = 0;
        while (i < u.conjunto.size()) {      
            int j = 0;
            while (j < conjunto.size()) {
                if (u.conjunto.get(i) == ab.conjunto.get(j))
                    i++;
                j++;    
            }
            if (i < conjunto.size())
                ab.insercao(u.conjunto.get(i));
            i++;
        }
        return ab;    
    }

    Conjunto intersec(Conjunto u) {
        Conjunto ab = new Conjunto(); 
        int i = 0;
        while (i < conjunto.size()) {
            int j = 0;
            while (j < u.conjunto.size()) {
                if (conjunto.get(i) == u.conjunto.get(j)) {
                    ab.insercao(conjunto.get(i));
                    i++;
                }    
                j++;
            }   
            i++;
        }
        return ab;
    }

    Conjunto diferenca(Conjunto u) {
        Conjunto ab = new Conjunto();
        int i = 0;
        while (i < conjunto.size()) {      
            int j = 0;
            while (j < u.conjunto.size()) {
                if (conjunto.get(i) == u.conjunto.get(j))
                    i++;
                j++;    
            }
            if (i < conjunto.size())
                ab.insercao(conjunto.get(i));
            i++;
        }
        return ab;
    }


    void produtoCartesiano(Conjunto b) {
        System.out.print("{");
        for (int i = 0; i < this.conjunto.size(); i++) {
            for (int j = 0; j < b.conjunto.size(); j++) {
                System.out.print("{" + this.conjunto.get(i) +", " + b.conjunto.get(j) + "}");
                if (i != this.conjunto.size() - 1 || j != b.conjunto.size() - 1)
                    System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    void potencia() {
        
    }

}