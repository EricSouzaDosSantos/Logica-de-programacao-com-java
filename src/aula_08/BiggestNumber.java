package aula_08;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        num2 = scanner.nextInt();
        System.out.println("Digite o ultimo numero ");
        num3 = scanner.nextInt();

        System.out.println("O maior numero digitado foi "+maiorNumero(num1, num2, num3));


    }

    public static int maiorNumero(int number1, int number2, int number3){
        int biggestNumber = 0;
            if (number1 > number2 && number1 > number3){
                biggestNumber = number1;
            }else if(number2 > number1 && number2 > number3){
                biggestNumber = number2;
            } else if (number3 > number2 && number3 > number1) {
                biggestNumber = number3;
            }
            return biggestNumber;
    }
}
