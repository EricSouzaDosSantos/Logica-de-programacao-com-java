package aula_07.examples;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[4];

        System.out.println("Digite o primeiro número");
        vetor[0] = scanner.nextInt();
        System.out.println("Digite o segundo número");
        vetor[1] = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        vetor[2] = scanner.nextInt();
        System.out.println("Digite o quarto número");
        vetor[3]= scanner.nextInt();

        System.out.println("vetor{"+vetor[0]+", "+vetor[1]+", "+vetor[2]+", "+vetor[3]+"}");
    }
}
