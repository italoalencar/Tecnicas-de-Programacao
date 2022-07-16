import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("$ java WordFrequency4");
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        WordFrequency4 teste = new WordFrequency4(frase);
        teste.frequenciaPalavras();
        s.close();
        
    }
}