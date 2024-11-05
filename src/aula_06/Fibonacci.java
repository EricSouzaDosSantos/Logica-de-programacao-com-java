package aula_06;

public class Fibonacci {
    public static void main(String[] args) {
                int n = 11; // Número de termos a serem gerados
                int primeiro = 0, segundo = 1;
                int i = 2;
                System.out.print("Os 10 primeiros números da sequência de Fibonacci são: ");
                    System.out.print(primeiro + " " + segundo + " ");

                while (i < n) {
                    i = ++i;
                    int proximo = primeiro + segundo;
                    System.out.print(proximo + " ");
                    primeiro = segundo;
                    segundo = proximo;
        }
    }
}
