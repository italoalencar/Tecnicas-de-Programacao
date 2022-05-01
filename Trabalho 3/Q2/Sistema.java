class Sistema {
    Contas array[] = new Contas[1000];


    void criarContaXPTOBasic(int id) {
        if (array[id] == null) {
            array[id] = new Basic();
            array[id].setID(id);
        }    
        else
            System.out.println("ID já cadastrado.");
    }

    void criarContaXPTOPlus(int id) {
        if (array[id] == null) {
            array[id] = new Plus();
            array[id].setID(id);
        }
        else
            System.out.println("ID já cadastrado.");
    }

    void criarContaXPTOExtreme(int id) {
        if (array[id] == null) {
            array[id] = new Extreme();
            array[id].setID(id);
        }
        else
            System.out.println("ID já cadastrado.");
    }

    void creditar(int id, double valor) {
        array[id].creditar(valor);
    }

    void debitar(int id, double valor) {
        array[id].debitar(valor);
    }

    double consultarSaldo(int id) { 
        return array[id].getSaldo();
    }

}
