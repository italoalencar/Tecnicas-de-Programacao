class Cliente {
	Conta [] contas = new Conta[100];
	String nome;
	String cpf;
	int idade;
    int cont = 0;

    Cliente(String nome, String cpf, int idade) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
    }

    void setConta(Conta c) {
        this.contas[cont++] = c;
    }

    void setNome(String pnome) {
        nome = pnome;
    }

    void setCpf(String pcpf) {
        cpf = pcpf;
    }

    void setIdade(int pidade) {
        idade = pidade;
    }


    String getNome() {
        return nome;
    }

    String getCpf() {
        return cpf;
    }

    int getIdade() {
        return idade;
    }

    int getCont() {
        return cont;
    }

    
	void fecharConta(Conta c){
        for (int i = 0; i < this.contas.length; i++) {
            if (this.contas[i] != null)
                if (this.contas[i] == c)
                    contas[i] = null;           
        }
	}

    void printCliente() {
        System.out.println("Nome do cliente: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade());
    }

}