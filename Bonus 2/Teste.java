class Teste {
    public static void main(String[] args) {
        Banco b1 = new Banco("Santander", 1);

        b1.cadastrarCliente("Italo", "000", 16);
        b1.cadastrarCliente("Jose", "001", 17);
        b1.cadastrarCliente("antonio", "002", 18);
        b1.cadastrarCliente("Maria", "003", 19);
        b1.listarCliente();

        b1.criarConta(b1.buscarCliente("000"), "Corrente");
        b1.criarConta(b1.buscarCliente("001"), "Digital");
        b1.criarConta(b1.buscarCliente("003"), "Poupanca");
        b1.listarConta();
        
        b1.buscarConta("000", 1).depositar(250);
        b1.pesquisarConta("000", 1);
        b1.buscarConta("000", 1).sacar(50);
        b1.buscarConta("000", 1).visualizarSaldo();

        b1.buscarCliente("003").printCliente();
        System.out.println();

        b1.fecharConta(b1.buscarConta("000", 1));

        b1.pesquisarConta("000", 1);

        b1.listarConta();

        b1.pesquisarCliente("004");
        
    }

}