import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

    }
}
