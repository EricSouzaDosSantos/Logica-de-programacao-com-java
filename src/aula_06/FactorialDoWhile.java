package aula_06;

import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        double factorial, numberScanner, result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ser fatorado:");
        numberScanner = scanner.nextInt();
        factorial = numberScanner;
        do {
            factorial--;
            double numero1 = numberScanner *= factorial;
            double numero3 = numero1/factorial;
            result = numero3;
            if (factorial == 1) {
                System.out.println(result);
            }
        }while (factorial >= 0);
    }
}
