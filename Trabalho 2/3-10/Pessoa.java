class Pessoa {
    
    String nome;
    int idade;
    Pessoa () {}

    Pessoa (String pnome, int pidade) {
        this.setNome(pnome);
        this.setIdade(pidade);
    }

    void setNome(String pnome) {
        nome = pnome;
    }

    String getNome() {
        return nome;
    }

    void setIdade(int pidade) {
        idade = pidade;
    }

    int getIdade() {
        return idade;
    }


    String format() {
        String aux = "NOME: " + this.getNome() + ", IDADE: " + this.getIdade() + ".";
        return aux;
    }
}