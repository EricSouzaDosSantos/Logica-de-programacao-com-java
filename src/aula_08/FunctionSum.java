package aula_08;

import java.util.Scanner;

public class FunctionSum {

    public static int somar(int number1, int number2){
        System.out.print("A soma desses números é de: ");
        return number1 + number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int number = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int number2 = scanner.nextInt();

        System.out.println(somar(number, number2));
    }


}
