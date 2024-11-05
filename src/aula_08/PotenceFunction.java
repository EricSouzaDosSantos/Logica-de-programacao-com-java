package aula_08;

import java.util.Scanner;

public class PotenceFunction {
    public static void main(String[] args) {
        int base, expoente;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número base ");
        base = scanner.nextInt();;
        System.out.print("Digite o expoente desse número ");
        expoente = scanner.nextInt();
        System.out.println("O resultado desse calculo é "+calcPotencia(base, expoente));
    }

    public static int calcPotencia(int base, int expoente){
    int result = 1;
    if (expoente == 1){
        result = base;
    }else {
        for (int i = 1; i < expoente; i++) {

            if (i == 1) {
                result *= base * base;
            } else {
                result *= base;
            }
        }
    }
        return result;
    }
}
