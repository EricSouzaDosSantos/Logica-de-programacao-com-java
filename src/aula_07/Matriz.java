package aula_07;

import java.util.Scanner;

public class Matriz {
    private int[][] matriz = new int[2][4];
    private Scanner scanner = new Scanner(System.in);
    private boolean enter = true;

    public void fillMatriz() {
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
}