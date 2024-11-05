package aula_08;

import java.util.Scanner;

public class FactorialFunction {

    public static void main(String[] args) {
        int factorialNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para fatorar ");
        factorialNum = scanner.nextInt();
        System.out.println("O resultado desse fatorial é "+calculatFatorial(factorialNum));

    }

    public static int calculatFatorial(int factorialNum){
        int x = factorialNum;

        for (int i = 1; i < x; i++) {
            factorialNum *= i;
        }
        return factorialNum;
    }
}
