package aula_08;

import java.util.Scanner;

public class DoubleValue {

    public static int dobrar(int number){
        return number * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Digite um número: ");
        number = scanner.nextInt();
        System.out.println("O dobro do número dgitado é "+dobrar(number));
    }
}
