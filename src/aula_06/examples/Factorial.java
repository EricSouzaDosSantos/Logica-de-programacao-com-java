package aula_06.examples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorialNumber;
        int x ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que você quer fatorar");
        x = scanner.nextInt();

        factorialNumber = x;

        for (int i = 1; i < x; i++) {
            factorialNumber *= i;
        }
        System.out.println(factorialNumber);



//        while (!(x > 0)) {
//            System.out.println("Digite um número inteiro para fazer o fatorial");
//            x = scanner.nextInt();
//            while (!(x < 0)){
//                factorialNumber = x * factorialNumber;
//                System.out.println(factorialNumber);
//                x -= 1;
//            }
//
//        }



    }
}
