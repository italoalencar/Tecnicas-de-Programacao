import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("$ java WordFrequency3");
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        WordFrequency3 teste = new WordFrequency3(frase);
        teste.frequenciaPalavras();
        s.close();
        
    }
}