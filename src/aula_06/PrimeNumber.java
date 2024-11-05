package aula_06;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número não é primo.");
        } else {
            boolean isPrimo = true;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
    }
}
