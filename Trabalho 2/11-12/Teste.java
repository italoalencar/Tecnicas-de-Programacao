class Teste {
    public static void main(String[] args) {

        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] b = {0,2,4,6,8};
        int[] c = {1,3,5,7,9};
        int[] d = {2,3,5,7,11};

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


        for (int i = 0; i < par.pos; i++)
            n.pertinencia(par.v[i]);
        System.out.println();

        for (int i = 0; i < impar.pos; i++)
            n.pertinencia(impar.v[i]);
        System.out.println();

        for (int i = 0; i < primo.pos; i++)
            n.pertinencia(primo.v[i]);
        System.out.println();

        par.uniao(impar).mostrarConjunto();     
        
        n.intersec(par).mostrarConjunto();

        n.diferenca(par).mostrarConjunto();

    }  

}