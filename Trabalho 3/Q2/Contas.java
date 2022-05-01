abstract class Contas {
    int id;
    double saldo;

    void setID(int id) {
        this.id = id;
    }

    int getID() {
        return id;
    }

    double getSaldo() {
        return saldo;
    }

    abstract void creditar(double valor);
    abstract void debitar(double valor);
}