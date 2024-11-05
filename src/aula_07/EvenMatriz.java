package aula_07;

import java.util.Scanner;

public class EvenMatriz {

    private int[][] matriz = new int[4][4];
    private Scanner scanner = new Scanner(System.in);
    private boolean enter = true;

    public void fillMatrix() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.println("Digite um número inteiro para a posição [" + i + "][" + j + "]:");
                    if (scanner.hasNextInt()) {
                        matriz[i][j] = scanner.nextInt();
                        enter = false;
                    } else {
                        System.out.println("Erro: Digite um número inteiro válido.");
                        enter = true;
                        scanner.next();
                    }
                } while (enter);
            }
        }
    }

    public void showMatriz() {
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int countPairs() {
        int countNumberPairs = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    countNumberPairs++;
                }
            }
        }
        return countNumberPairs;
    }

    public void showpairs() {
        int quantNumbersPairs = countPairs();
        System.out.println("A quantidade de números pares na matriz é: " + quantNumbersPairs);
    }
}
