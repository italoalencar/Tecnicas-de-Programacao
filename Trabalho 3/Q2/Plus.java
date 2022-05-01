class Plus extends Contas {

    void creditar(double valor) {
        double aux = valor + (valor * 0.005);
        saldo = saldo + aux;
    }

    void debitar(double valor) {
        if (valor > saldo)
            System.out.println("Saldo insuficiente.");
        else
            saldo = saldo - valor;
    }

    public String toString() {
        return "Conta XPTOPlus\nID: " + getID() + "\nSaldo: R$" + getSaldo();
    }
    
}
