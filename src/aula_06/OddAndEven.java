package aula_06;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        int number;
        int pares = 0;
        int impares =0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro");
            number = scanner.nextInt();
            if (number % 2 == 0){
                pares++;
            }
            else {
                impares++;
            }
        }
        System.out.println("Você digitou "+pares+" numeros pares");
        System.out.println("Você digitou "+impares+" numeros impares");

    }
}
