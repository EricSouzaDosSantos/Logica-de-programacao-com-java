package aula_08;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nota1, nota2, nota3;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextInt();

        System.out.println("A média das notas anteriores tem o valor de "+average(nota1, nota2, nota3));
    }

    public static int average(int nota1, int nota2, int nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
}
