import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("$ java WordFrequency2");
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        WordFrequency2 teste = new WordFrequency2(frase);
        teste.frequenciaPalavras();
        s.close();
        
    }
}