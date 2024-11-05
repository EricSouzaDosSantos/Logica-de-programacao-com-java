package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class OddOrEvenNumber {
    private ArrayList<Integer> pares = new ArrayList<>();
    private ArrayList<Integer> impares = new ArrayList<>();

    public void receberNumeros() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro (negativo para encerrar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo inserido, encerrando...");
                break;
            }

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada.");
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
    }

    public void exibirNumerosClassificados() {
        System.out.println("\nNúmeros Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
    }

}
