package Backend;

/**
 *
 * @author italoa
 */
import java.io.*;
import java.util.ArrayList;

public class Sistema {
    public ArrayList<User> db = new ArrayList<>();
    String email = "admin@email.com";
    String senha = "admin";
    
    public Sistema(){
        try (BufferedReader buffRead = new BufferedReader(new FileReader("Backend/dados.txt"))) {
            String linha;
            while (true) {
                linha = buffRead.readLine();
                if (linha != null) {
                    String array[] = new String[5];
                    array = linha.split(",");
                    User user = new User(array[0],array[1],array[2],array[3],array[4]);
                    this.db.add(user);

                }else{
                    break;
                }
        }
        buffRead.close();
        }catch(Exception e){
            System.out.println(e); 
        }
    }
    
    
    public ArrayList<User> RetornaUsuarios(){
        return this.db;
    }
    
    public User BuscaUsuario(String email, String senha){
        for(User usuario : db){
            if((usuario.getEmail().equals(email) && (usuario.getSenha().equals(senha))))
                return usuario;
        }
        return null;    
    }
    
    public boolean cadastro(String nome, String cpf, String email, String data, String senha) throws IOException {
        boolean aux = true;
        int i = 0;
        
        while (i < db.size()) {
            User user = (User) db.get(i);
            if ((user.getEmail().equals(email)) || (user.getCpf().equals(cpf))) {
                System.out.println("Usuário já cadastrado!");
                aux = false;
                return aux;
            }
            i = i + 1;
        }

        if (aux) {
            User cadnew = new User(nome, cpf, email, data, senha);
            db.add(cadnew);
            System.out.println("Usuário foi cadastrado.");
            
            this.atualizarDados();
            return aux;

        }
        return aux;
    }
    
    
    public boolean check_email_cpf(String cpf, String email) throws IOException {
        boolean aux = true;
        int i = 0;
        
        while (i < db.size()) {
            User user = (User) db.get(i);
            if ((user.getEmail().equals(email)) || (user.getCpf().equals(cpf))) {
                aux = false;
                return aux;
            }
            i = i + 1;
        }

        if (aux) {    
            return aux;

        }
        return aux;
    }


    public int loginEmail(String email, String senha) {
        // 1 =  email nao existe
        // 2 =  email existe e senha ta errada
        // 3 =  email existe e senha correta
        
        int aux = 1;
        int i = 0;
        while (i < db.size()) {
            User cad = db.get(i);
            if (cad.getEmail().equals(email)) { 
                
                boolean senhaExiste = cad.loginSenha(senha);
                
                if(senhaExiste){
                    aux = 3;
                    return aux;
                }
                aux = 2;
                return aux;
                
            }
            i = i + 1;
        }

        if(aux == 1) {
            System.out.println("Essa conta não existe!");  
        }
        return aux;
    }
    
    public String recuperaSenha(String email) {
        int i = 0;
        while (i < db.size()) {
            User cad = db.get(i);
            if (cad.getEmail().equals(email)) {
                return cad.getSenha();
    
            }
            i = i + 1;
        }
        
            return null;   
    
    }
    
    
    public void deletar(User obj) {
        int i = 0;
        while (i < db.size()) {
            User user = (User) db.get(i);
            if (user == obj) {
                db.remove(obj);
                System.out.println("Usuário deletado!");
                break;
            }
            i = i + 1;
        }

        this.atualizarDados();
    }

    public void atualizarDados(){
        try {
            File arq = new File("Backend/dados.txt");
            if (!arq.exists()) {
                arq.createNewFile(); 
                }

            FileWriter gravador = new FileWriter(arq);
            try (BufferedWriter buffer = new BufferedWriter(gravador)) {
                for (int i = 0; i < db.size(); i++) {
                    User cad = (User) db.get(i);
                    for (int j = 0; i <)
                    String linha = cad.getNome() + "," + cad.getCpf() + "," + cad.getEmail() + "," + cad.getData() + "," + cad.getSenha() + "\n";
                    buffer.write(linha);
                }                
            }catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public String getEmailSistema(){
        return this.email;
    }

    public String getSenhaSistema(){
        return this.senha;
    }
    
    public void setSenhaSistema(String novaSenha){
        this.senha = novaSenha;
    }
}
