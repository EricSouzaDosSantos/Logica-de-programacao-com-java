package aula_07;

import java.util.Scanner;

public class RealMatriz {

    private double[][] matriz = new double[2][2];
    private Scanner scanner = new Scanner(System.in);
    private boolean enter = true;

    public void fillMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.println("Digite um número real para a posição [" + i + "][" + j + "]:");
                    if (scanner.hasNextDouble()) {
                        matriz[i][j] = scanner.nextDouble();
                        enter = false;
                    } else {
                        System.out.println("Erro: Digite um número real válido.");
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

    public void sumRow() {
        for (int i = 0; i < matriz.length; i++) {
            double sumRow = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumRow += matriz[i][j];
            }
            System.out.println("A soma dos valores da linha " + (i + 1) + " é: " + sumRow);
        }
    }
}
