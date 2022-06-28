package Backend;

/**
 *
 * @author italoa
 */
public class User {
    String nome;
    String cpf;
    String email;
    String data;
    String senha;

    public User(String nome, String cpf, String email, String data, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data = data;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getData() {
        return data;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean loginSenha(String senha) {
        if (getSenha().equals(senha)) {
            System.out.println("Login efetuado com sucesso!");
            return true;
        }
        else {
            System.out.println("Senha incorreta. Tente novamente!");
            // Chamar login novamente
            return false;
        }
    }
}
