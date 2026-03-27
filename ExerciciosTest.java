import java.util.*;

public class ExerciciosTest {
    public static void main(String[] args) {

        Exercicio ex = new Exercicio();

        ex.separarLetras("Java");

        ex.tabuada(5);

        ex.numerosAleatorios();

        ex.diaSemana(3);

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria");
        ex.mostrarNomes(nomes);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Pares: " + ex.contarPares(nums));

        int[] v = {1,2,3,4,5};
        System.out.println("Soma: " + ex.somaArray(v));

        double[] notas = {7,8,9};
        System.out.println("Média: " + ex.media(notas));
    }
}