package aula_07;

import java.util.Scanner;

public class LargestMatrix {

    private int[][] matriz = new int[3][3];
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


    public int searchLargest() {
        int countLargest = 0;
        for (int[] bigNumber : matriz){
        }

        return countLargest;
    }

    public void showLargestNumber() {
        int bigNumber = searchLargest();
        System.out.println("O maior número da matriz é o " + bigNumber);
    }
}
