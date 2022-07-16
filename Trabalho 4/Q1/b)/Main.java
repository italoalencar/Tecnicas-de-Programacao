import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        System.out.println("$ java WordFrequency");
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        WordFrequency teste = new WordFrequency(frase);
        teste.frequenciaPalavras();
        s.close();

    }
}