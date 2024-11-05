package aula_08;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em Graus Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("O valor em Fareheirt é "+conversorDeCelsiusParaFareherir(celsius));
    }

    public static double conversorDeCelsiusParaFareherir(double celsius){
        return celsius * 1.18 + 32;
    }
}
