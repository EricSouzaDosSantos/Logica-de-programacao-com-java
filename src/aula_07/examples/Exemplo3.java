package aula_07.examples;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas posições você deseja ");
        int posicoes = scanner.nextInt();
        int[] vetor = new int[posicoes];
        String mostraValor = "vetor{";

        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Digite o "+posicao+" número");
            vetor[posicao] = scanner.nextInt();
            mostraValor += vetor[posicao];
            mostraValor += posicao<vetor.length-1 ? ", ":"}";
        }
        System.out.println(mostraValor);
    }
}
