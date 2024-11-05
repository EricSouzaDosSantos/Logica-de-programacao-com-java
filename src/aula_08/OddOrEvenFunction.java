package aula_08;

import java.util.Scanner;

public class OddOrEvenFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.println("Digite um número para verificar se ele é impar ou par");
        number = scanner.nextDouble();

        if (imoarOuPar(number) == true){
            System.out.println("O número digitado é par!! retornou "+imoarOuPar(number));
        }else {
            System.out.println("O número digitado é impar!! retornou "+imoarOuPar(number));
        }

    }

    public static boolean imoarOuPar(double number){
        boolean valueBoolean;
        if (number % 2 == 0){
            valueBoolean = true;
        }else {
            valueBoolean = false;
        }
        return valueBoolean;
    }
}
