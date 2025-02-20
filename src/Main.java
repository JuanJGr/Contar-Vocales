import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingresa una palabra o frase:");
        String input = scanner.nextLine();

        int contadorVocales = 0;


        input = input.toLowerCase();


        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);

    }
}