package aula_06.examples;

import java.util.Scanner;

public class TestingWhile {
    public static void main(String[] args) {
        int old = 15;
        String name = "Rafael", scannerName;
        Scanner scanner = new Scanner(System.in);


        while (old < 18){
            old = old + 1;
        }

        System.out.println("Digite seu nome:");
        scannerName = scanner.nextLine();

        while (!scannerName.equals(name)){
            System.out.println("Digitou o nome errado, Digite novamente:");
            scannerName = scanner.nextLine();
        }
        System.out.println("Parabéns, Acertou o seu próprio nome");
    }
}
