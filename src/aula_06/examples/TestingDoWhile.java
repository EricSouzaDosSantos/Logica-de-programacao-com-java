package aula_06.examples;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class TestingDoWhile {
    public static void main(String[] args) {
        String name = "Eric", scannerName;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome");
            scannerName = scanner.nextLine();

        }while (!scannerName.equals(name));
    }
}
