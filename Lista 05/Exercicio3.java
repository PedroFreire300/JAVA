import java.util.Random;

public class Exercicio3 {

    public static void main(String[] args) {

        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(letras.length());
            System.out.print(letras.charAt(n));
        }

    }
}S
