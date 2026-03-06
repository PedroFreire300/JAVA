import java.util.Random;

public class Exercicio3 {

    public static void main(String[] args) {

        Random r = new Random();

        int numero = 1000 + r.nextInt(9000);

        System.out.println("Numero sorteado: " + numero);

        String n = String.valueOf(numero);

        for (int i = 0; i < n.length(); i++) {

            char digito = n.charAt(i);

            if (digito == '0') System.out.print("zero ");
            if (digito == '1') System.out.print("um ");
            if (digito == '2') System.out.print("dois ");
            if (digito == '3') System.out.print("tres ");
            if (digito == '4') System.out.print("quatro ");
            if (digito == '5') System.out.print("cinco ");
            if (digito == '6') System.out.print("seis ");
            if (digito == '7') System.out.print("sete ");
            if (digito == '8') System.out.print("oito ");
            if (digito == '9') System.out.print("nove ");

        }

    }
}
