class Extreme extends Contas {

    void creditar(double valor) {
        double aux = valor + (valor * 0.002);
        saldo = saldo + aux;
    }

    void debitar(double valor) {
        if (valor > saldo)
            System.out.println("Saldo insuficiente.");
        else {
            double aux = valor - (valor * 0.002);
            saldo = saldo - aux;
        }
    }

    public String toString() {
        return "Conta XPTOExtreme\nID: " + getID() + "\nSaldo: R$" + getSaldo();
    }
    
}
