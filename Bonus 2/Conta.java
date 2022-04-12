class Conta {
	Banco banco;
	Cliente dono;
	float saldo;
	String tipo;
    int id; 

    Conta (Cliente dono, String tipo, Banco banco) {
        this.setDono(dono);
        this.setTipo(tipo);
        this.setBanco(banco);
        dono.setConta(this);
        id = dono.getCont();
    }

    void setDono(Cliente dono){
        this.dono = dono;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }

    void setBanco(Banco banco) {
        this.banco = banco;
    }


    float getSaldo() {
        return saldo;
    }

    String getTipo() {
        return tipo;
    }
    
    int getId() {
        return id;
    }


	void sacar(float valor) {
        if (valor > saldo) 
            System.out.println("Saldo insuficiente.");
        else
            saldo = saldo - valor;
    }

	void depositar(float valor) {
        saldo = saldo + valor;
    }
	
    void visualizarSaldo() {
        System.out.println("Seu saldo é: R$ " + saldo);
        System.out.println();
    }
	
	void fecharConta () {
		dono.fecharConta(this);
	}

    void printConta() {
        System.out.println("Nome do Banco: " + banco.getNome() + "\nDono da Conta: " + dono.getNome() + "\nSaldo: R$ " + getSaldo() + "\nTipo de Conta: " + getTipo());
    }

}