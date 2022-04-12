class Main {
    public static void main(String args[]) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        p1.setIdade(21);

        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        p2.setIdade(25);

        Pessoa p3 = new Pessoa("Jose", 34);

        System.out.println(p1.format());

        System.out.println(p2.format());

        System.out.println(p3.format());

    }
}
