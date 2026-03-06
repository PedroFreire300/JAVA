import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Digite a quantidade de digitos da senha: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numero = r.nextInt(10);
            System.out.print(numero);
        }

    }
}