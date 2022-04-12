class Conjunto {
    int [] v =  new int [10000];
    int pos = 0;
    int n = 0;

    Conjunto () {}

    Conjunto (int v[]) {
        for (int i = 0; i < v.length; i++) {
            this.v[i] = v[i];
        }
        pos = v.length;
    }

    Conjunto (int v[], int pos2) {
        for (int i = 0; i < pos2; i++) {
            this.v[i] = v[i];
        }
        pos = pos2;
    }

    void mostrarConjunto() {

        System.out.print("{");
        if (pos == 1)
            System.out.print(v[pos-1]);
        else {
            for (int i = 0; i < (pos - 1); i++)
                System.out.print(v[i] + ", ");
            if (pos != 0)    
                System.out.print(v[pos - 1]);
        }
        System.out.println("}");
        System.out.println();
    }

    void insercao(int elemento) {
        v[pos++] = elemento;
    }

    void pertinencia(int elemento) {
        for (int i = 0; i < pos; i++) {
            if (v[i] == elemento) {
                System.out.println(elemento + " pertence ao conjunto");
                return;
            }
        }
        System.out.println(elemento + " nao pertence ao conjunto");
    }

    void isSub(Conjunto sub) {
        if (sub.pos > this.pos) {
            System.out.println("Nao eh subconjunto");
        }
        else {
            int i = 0;
            while (i < sub.pos) {
                int j = 0;
                while (sub.v[i] != this.v[j] && j < this.pos) {
                    j++;
                }
                if (j == this.pos){
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
        Conjunto ab = new Conjunto(this.v, this.pos);
        int i = 0;
        while (i < u.pos) {      
            int j = 0;
            while (j < this.pos) {
                if (u.v[i] == ab.v[j])
                    i++;
                j++;    
            }
            if (i < pos)
                ab.insercao(u.v[i]);
            i++;
        }
        return ab;    
    }

    Conjunto intersec(Conjunto u) {
        Conjunto ab = new Conjunto();
        int i = 0;
        while (i < this.pos) {
            int j = 0;
            while (j < u.pos) {
                if (this.v[i] == u.v[j]) {
                    ab.insercao(this.v[i]);
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
        while (i < this.pos) {      
            int j = 0;
            while (j < u.pos) {
                if (this.v[i] == u.v[j])
                    i++;
                j++;    
            }
            if (i < pos)
                ab.insercao(this.v[i]);
            i++;
        }
        return ab;
    }

}