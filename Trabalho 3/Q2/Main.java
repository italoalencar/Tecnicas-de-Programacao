class Main {
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExtreme(3);


        for (int i = 1; i <= 3; i++)
            s.creditar(i,1000);

        for (int j = 1; j <= 3; j++)
            s.debitar(j, 10);

        System.out.println(s.consultarSaldo(1));
        System.out.println(s.consultarSaldo(2));
        System.out.println(s.consultarSaldo(3));
        System.out.println();

        for (int k = 1; k <= 3; k++) {
            System.out.println(s.array[k].toString());
            System.out.println();
        }    
    }
}       
