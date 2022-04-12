class Banco {

	String nome;
	int codigo;
	Conta [] contas = new Conta[100];
	Cliente [] clientes = new Cliente[100];
    int contaConta = 0, contaCliente = 0;


    Banco(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    String getNome() {
        return this.nome;
    }

	void criarConta (Cliente c, String tipo) {
        if (c == null) {
            System.out.println("Cliente invalido.");
            System.out.println();
        }    
        else    
		    contas[contaConta++] = new Conta(c,tipo,this);

	}

	void cadastrarCliente (String nome, String cpf, int idade) {
        boolean verif = false;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null)
                if ((clientes[i].getNome() == nome) & (clientes[i].getCpf() == cpf))
                    verif = true;
                            
        }
        if (verif == true) {
            System.out.println("Esse cliente ja foi cadastrado!");
            System.out.println();
        }
        else
		    clientes[contaCliente++] = new Cliente(nome, cpf, idade);
	}

	void listarConta() {
        if (contaConta == 0)
            System.out.println("Nao ha contas no banco " + getNome() + ".");
        else    
            for (int i = 0; i < this.contas.length; i++) {
                if (this.contas[i] != null)
                    this.contas[i].printConta();
            }
        
        System.out.println();
    }

    void listarCliente() {
        if (contaCliente == 0)
            System.out.println("Nao ha clientes cadastrados no banco " + getNome() + ".");
        else
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] != null)
                    this.clientes[i].printCliente();
            }
        System.out.println();
    }

    void pesquisarConta (String cpf, int numero) {
        boolean verif = false;
        int check = 0;
        Cliente aux = buscarCliente(cpf);
        for (int i = 0; i < aux.contas.length; i++) {                      
            if (aux.contas[i] != null){
                if (aux.contas[i].id == numero)
                    verif = true;
                    check = i;                                             
            }
        }
        if (verif == true)
            aux.contas[check].printConta();
        else
            System.out.println("Essa conta nao existe.");
            System.out.println(); 
    }

    Conta buscarConta (String cpf, int numero) {       
        Cliente aux = buscarCliente(cpf);
        for (int i = 0; i < aux.contas.length; i++) {
            if (aux.contas[i] != null) {
                if (aux.contas[i].id == numero)
                    return aux.contas[i];           
            }
        }
        return null;
    }

    void pesquisarCliente(String cpf) {
        boolean verif = false;
        int check = 0;
        for (int i = 0; i < this.clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getCpf() == cpf)
                    verif = true;
                    check = i;
            }
        }     
        if (verif == true)
            clientes[check].printCliente();
        else
            System.out.println("Esse cliente nao esta cadastrado.");
        System.out.println();    
    }

    Cliente buscarCliente(String cpf) {      
        for (int i = 0; i < this.clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getCpf() == cpf)
                    return clientes[i];
            }
        }
        return null;    
    }
	
	void fecharConta (Conta c) {	
        for (int i = 0; i < this.contas.length; i++) {
            if (this.contas[i] != null)
                if (this.contas[i] == c)
                    contas[i] = null;                          
        }
        System.out.println("Conta fechada.");
        System.out.println();
        c.fecharConta();
        contaConta = contaConta-1;
	}

}