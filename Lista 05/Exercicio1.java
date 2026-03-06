import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }

    }
}
