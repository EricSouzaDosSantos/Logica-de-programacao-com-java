package aula_07.examples;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mostrarValor = "matriz{\n";

        int[][] matriz = new int[2][2];

        for (int linha = 0; linha < matriz.length; linha++) {
            mostrarValor += "\t{";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posição ["+linha+", "+coluna+"] =");
                matriz[linha][coluna] = scanner.nextInt();
                mostrarValor += matriz[linha][coluna];
                mostrarValor += coluna < (matriz[linha].length - 1) ? ", ": "}";
            }
            mostrarValor += linha < (matriz.length - 1) ? ",\n" : "\n}";
        }
        System.out.println(mostrarValor);
    }
}
