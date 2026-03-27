import java.util.List;
import java.util.Random;

public class Exercicio {

    // a) separar letras
    public void separarLetras(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }

    // b) tabuada
    public void tabuada(int n) {
        if (n < 1 || n > 10) {
            System.out.println("Número inválido");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // c) números aleatórios
    public void numerosAleatorios() {
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(100) + 1);
        }
    }

    // d) dia da semana
    public void diaSemana(int n) {
        switch (n) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Inexistente");
        }
    }

    // e) lista de nomes
    public void mostrarNomes(List<String> nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // f) contar pares
    public int contarPares(List<Integer> lista) {
        int cont = 0;

        for (int n : lista) {
            if (n % 2 == 0) {
                cont++;
            }
        }

        return cont;
    }

    // g) soma array
    public int somaArray(int[] v) {
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        return soma;
    }

    // h) média notas
    public double media(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    // i) vetor aleatório
    public int[] vetorAleatorio(int n1, int n2) {
        Random r = new Random();
        int[] v = new int[n1];

        for (int i = 0; i < n1; i++) {
            v[i] = r.nextInt(n2);
        }

        return v;
    }

    // j) validar CPF (simples)
    public boolean validarCPF(String cpf) {
        return cpf.length() == 11;
    }
}
