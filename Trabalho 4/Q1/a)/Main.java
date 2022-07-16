import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("$ java CountWords");
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        CountWords teste = new CountWords(frase);
        teste.contarPalavras();
        s.close();
        
    }
}