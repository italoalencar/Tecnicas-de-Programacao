class Basic extends Contas {

    void creditar(double valor) {
        saldo = saldo + valor;
    }

    void debitar(double valor) {
        if (valor > saldo)
            System.out.println("Saldo insuficiente.");
        else
            saldo = saldo - valor;
    }

    public String toString() {
        return "Conta XPTOBasic\nID: " + getID() + "\nSaldo: R$" + getSaldo();
    }

}